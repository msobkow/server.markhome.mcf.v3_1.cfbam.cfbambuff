
// Description: Java 25 Default Factory implementation for UuidCol buffers

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
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
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

/*
 *	CFBamBuffUuidColFactory implementation of ICFBamUuidColFactory for UuidCol
 */
public class CFBamBuffUuidColDefaultFactory
	implements ICFBamUuidColFactory
{
	public CFBamBuffUuidColDefaultFactory() {
	}

	@Override
	public ICFBamUuidColByTableIdxKey newByTableIdxKey() {
		ICFBamUuidColByTableIdxKey key =
			new CFBamBuffUuidColByTableIdxKey();
		return( key );
	}

	public CFBamBuffUuidColByTableIdxKey ensureByTableIdxKey(ICFBamUuidColByTableIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffUuidColByTableIdxKey) {
			return( (CFBamBuffUuidColByTableIdxKey)key );
		}
		else {
			CFBamBuffUuidColByTableIdxKey mapped = new CFBamBuffUuidColByTableIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamUuidCol newRec() {
		ICFBamUuidCol rec =
			new CFBamBuffUuidCol();
		return( rec );
	}

	public CFBamBuffUuidCol ensureRec(ICFBamUuidCol rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof CFBamBuffUuidCol) {
			return( (CFBamBuffUuidCol)rec );
		}
		else {
			CFBamBuffUuidCol mapped = new CFBamBuffUuidCol();
			mapped.set(rec);
			return( mapped );
		}
	}

	@Override
	public ICFBamUuidColH newHRec() {
		ICFBamUuidColH hrec =
			new CFBamBuffUuidColH();
		return( hrec );
	}

	public CFBamBuffUuidColH ensureHRec(ICFBamUuidColH hrec) {
		if (hrec == null) {
			return( null );
		}
		else if( hrec instanceof CFBamBuffUuidColH) {
			return( (CFBamBuffUuidColH)hrec );
		}
		else {
			CFBamBuffUuidColH mapped = new CFBamBuffUuidColH();
			mapped.set(hrec);
			return( mapped );
		}
	}
}
