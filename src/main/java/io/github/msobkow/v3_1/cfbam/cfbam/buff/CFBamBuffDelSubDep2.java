// Description: Java 25 implementation of a DelSubDep2 buffer

/*
 *	io.github.msobkow.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal 3.1 CFBam - Business Application Model
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later.
 *	
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *	
 */

package io.github.msobkow.v3_1.cfbam.cfbam.buff;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import io.github.msobkow.v3_1.cflib.*;
import io.github.msobkow.v3_1.cflib.dbutil.*;
import io.github.msobkow.v3_1.cflib.xml.CFLibXmlUtil;
import io.github.msobkow.v3_1.cfsec.cfsec.*;
import io.github.msobkow.v3_1.cfint.cfint.*;
import io.github.msobkow.v3_1.cfbam.cfbam.*;
import io.github.msobkow.v3_1.cfsec.cfsec.buff.*;
import io.github.msobkow.v3_1.cfint.cfint.buff.*;

public class CFBamBuffDelSubDep2
	extends CFBamBuffDelDep
	implements ICFBamDelSubDep2
{
	protected CFLibDbKeyHash256 requiredDelSubDep1Id;
	protected String requiredName;

	public CFBamBuffDelSubDep2() {
		super();
		requiredDelSubDep1Id = CFLibDbKeyHash256.fromHex( ICFBamDelSubDep2.DELSUBDEP1ID_INIT_VALUE.toString() );
		requiredName = ICFBamDelSubDep2.NAME_INIT_VALUE;
	}

	@Override
	public int getClassCode() {
		return( ICFBamDelSubDep2.CLASS_CODE );
	}

	@Override
	public ICFBamDelSubDep1 getRequiredContainerDelSubDep1() {
		ICFBamSchema targetBackingSchema = ICFBamSchema.getBackingCFBam();
		if (targetBackingSchema == null) {
			throw new CFLibNullArgumentException(getClass(), "setRequiredContainerDelSubDep1", 0, "ICFBamSchema.getBackingCFBam()");
		}
		ICFBamDelSubDep1Table targetTable = targetBackingSchema.getTableDelSubDep1();
		if (targetTable == null) {
			throw new CFLibNullArgumentException(getClass(), "setRequiredContainerDelSubDep1", 0, "ICFBamSchema.getBackingCFBam().getTableDelSubDep1()");
		}
		ICFBamDelSubDep1 targetRec = targetTable.readDerived(null, getRequiredDelSubDep1Id());
		return(targetRec);
	}
	@Override
	public void setRequiredContainerDelSubDep1(ICFBamDelSubDep1 argObj) {
		if(argObj == null) {
			throw new CFLibNullArgumentException(getClass(), "setContainerDelSubDep1", 1, "argObj");
		}
		else {
			requiredDelSubDep1Id = argObj.getRequiredId();
		}
	}

	@Override
	public void setRequiredContainerDelSubDep1(CFLibDbKeyHash256 argDelSubDep1Id) {
		requiredDelSubDep1Id = argDelSubDep1Id;
	}

	@Override
	public List<ICFBamDelSubDep3> getOptionalComponentsDelDep() {
		ICFBamSchema targetBackingSchema = ICFBamSchema.getBackingCFBam();
		if (targetBackingSchema == null) {
			throw new CFLibNullArgumentException(getClass(), "setOptionalComponentsDelDep", 0, "ICFBamSchema.getBackingCFBam()");
		}
		ICFBamDelSubDep3Table targetTable = targetBackingSchema.getTableDelSubDep3();
		if (targetTable == null) {
			throw new CFLibNullArgumentException(getClass(), "setOptionalComponentsDelDep", 0, "ICFBamSchema.getBackingCFBam().getTableDelSubDep3()");
		}
		ICFBamDelSubDep3[] targetArr = targetTable.readDerivedByDelSubDep2Idx(null, getRequiredId());
		if( targetArr != null ) {
			List<ICFBamDelSubDep3> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return( results );
		}
		else {
			List<ICFBamDelSubDep3> results = new ArrayList<>();
			return( results );
		}
	}
	@Override
	public CFLibDbKeyHash256 getRequiredDelSubDep1Id() {
		return( requiredDelSubDep1Id );
	}

	@Override
	public String getRequiredName() {
		return( requiredName );
	}

	@Override
	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		else if( value.length() > 192 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		requiredName = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof ICFBamDelSubDep2 ) {
			ICFBamDelSubDep2 rhs = (ICFBamDelSubDep2)obj;
			if( getRequiredId() != null && !getRequiredId().isNull() ) {
				if( rhs.getRequiredId() != null && !rhs.getRequiredId().isNull() ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null && !getRequiredId().isNull()) {
					return( false );
				}
			}
			if( getRequiredDelSubDep1Id() != null && !getRequiredDelSubDep1Id().isNull() ) {
				if( rhs.getRequiredDelSubDep1Id() != null && !rhs.getRequiredDelSubDep1Id().isNull() ) {
					if( ! getRequiredDelSubDep1Id().equals( rhs.getRequiredDelSubDep1Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredDelSubDep1Id() != null && !getRequiredDelSubDep1Id().isNull()) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ICFBamDelSubDep2H ) {
			ICFBamDelSubDep2H rhs = (ICFBamDelSubDep2H)obj;
			if( getRequiredId() != null && !getRequiredId().isNull() ) {
				if( rhs.getRequiredId() != null && !rhs.getRequiredId().isNull() ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null && !getRequiredId().isNull()) {
					return( false );
				}
			}
			if( getRequiredDelSubDep1Id() != null && !getRequiredDelSubDep1Id().isNull() ) {
				if( rhs.getRequiredDelSubDep1Id() != null && !rhs.getRequiredDelSubDep1Id().isNull() ) {
					if( ! getRequiredDelSubDep1Id().equals( rhs.getRequiredDelSubDep1Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredDelSubDep1Id() != null && !getRequiredDelSubDep1Id().isNull()) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ICFBamScopeHPKey ) {
			ICFBamScopeHPKey rhs = (ICFBamScopeHPKey)obj;
			if( getRequiredId() != null && !getRequiredId().isNull() ) {
				if( rhs.getRequiredId() != null && !rhs.getRequiredId().isNull() ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null && !getRequiredId().isNull()) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ICFBamDelSubDep2ByContDelDep1IdxKey ) {
			ICFBamDelSubDep2ByContDelDep1IdxKey rhs = (ICFBamDelSubDep2ByContDelDep1IdxKey)obj;
			if( getRequiredDelSubDep1Id() != null && !getRequiredDelSubDep1Id().isNull() ) {
				if( rhs.getRequiredDelSubDep1Id() != null && !rhs.getRequiredDelSubDep1Id().isNull() ) {
					if( ! getRequiredDelSubDep1Id().equals( rhs.getRequiredDelSubDep1Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredDelSubDep1Id() != null && !getRequiredDelSubDep1Id().isNull()) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ICFBamDelSubDep2ByUNameIdxKey ) {
			ICFBamDelSubDep2ByUNameIdxKey rhs = (ICFBamDelSubDep2ByUNameIdxKey)obj;
			if( getRequiredDelSubDep1Id() != null && !getRequiredDelSubDep1Id().isNull() ) {
				if( rhs.getRequiredDelSubDep1Id() != null && !rhs.getRequiredDelSubDep1Id().isNull() ) {
					if( ! getRequiredDelSubDep1Id().equals( rhs.getRequiredDelSubDep1Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredDelSubDep1Id() != null && !getRequiredDelSubDep1Id().isNull()) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	@Override
	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = hashCode + getRequiredDelSubDep1Id().hashCode();
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof ICFBamDelSubDep2 ) {
			ICFBamDelSubDep2 rhs = (ICFBamDelSubDep2)obj;
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredDelSubDep1Id() != null) {
				if (rhs.getRequiredDelSubDep1Id() != null) {
					cmp = getRequiredDelSubDep1Id().compareTo( rhs.getRequiredDelSubDep1Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredDelSubDep1Id() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ICFBamScopeHPKey ) {
			ICFBamScopeHPKey rhs = (ICFBamScopeHPKey)obj;
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ICFBamDelSubDep2H ) {
			ICFBamDelSubDep2H rhs = (ICFBamDelSubDep2H)obj;
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredDelSubDep1Id() != null) {
				if (rhs.getRequiredDelSubDep1Id() != null) {
					cmp = getRequiredDelSubDep1Id().compareTo( rhs.getRequiredDelSubDep1Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredDelSubDep1Id() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ICFBamDelSubDep2ByContDelDep1IdxKey ) {
			ICFBamDelSubDep2ByContDelDep1IdxKey rhs = (ICFBamDelSubDep2ByContDelDep1IdxKey)obj;

			if (getRequiredDelSubDep1Id() != null) {
				if (rhs.getRequiredDelSubDep1Id() != null) {
					cmp = getRequiredDelSubDep1Id().compareTo( rhs.getRequiredDelSubDep1Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredDelSubDep1Id() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof ICFBamDelSubDep2ByUNameIdxKey ) {
			ICFBamDelSubDep2ByUNameIdxKey rhs = (ICFBamDelSubDep2ByUNameIdxKey)obj;

			if (getRequiredDelSubDep1Id() != null) {
				if (rhs.getRequiredDelSubDep1Id() != null) {
					cmp = getRequiredDelSubDep1Id().compareTo( rhs.getRequiredDelSubDep1Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredDelSubDep1Id() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}			return( 0 );
		}
		else {
			cmp = super.compareTo( obj );
			return( cmp );
		}
	}

	@Override
	public void set( ICFBamScope src ) {
		if( src instanceof CFBamBuffDelSubDep2 ) {
			setDelSubDep2( (CFBamBuffDelSubDep2)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamBuffDelSubDep2" );
		}
	}

	@Override
	public void setDelSubDep2( ICFBamDelSubDep2 src ) {
		super.setDelDep( src );
		setRequiredContainerDelSubDep1(src.getRequiredContainerDelSubDep1());
		setRequiredName(src.getRequiredName());
	}

	@Override
	public void set( ICFBamScopeH src ) {
		if( src instanceof ICFBamDelSubDep2H ) {
			setDelSubDep2( (ICFBamDelSubDep2H)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"ICFBamDelSubDep2H" );
		}
	}

	@Override
	public void setDelSubDep2( ICFBamDelSubDep2H src ) {
		super.setDelDep( src );
		setRequiredContainerDelSubDep1(src.getRequiredDelSubDep1Id());
		setRequiredName(src.getRequiredName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment() 
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " RequiredDelSubDep1Id=" + "\"" + getRequiredDelSubDep1Id().toString() + "\""
			+ " RequiredName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<CFBamBuffDelSubDep2" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}
