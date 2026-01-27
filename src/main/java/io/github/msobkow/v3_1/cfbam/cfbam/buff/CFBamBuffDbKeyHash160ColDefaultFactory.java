
// Description: Java 25 Default Factory implementation for DbKeyHash160Col buffers

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
 *	CFBamBuffDbKeyHash160ColFactory implementation of ICFBamDbKeyHash160ColFactory for DbKeyHash160Col
 */
public class CFBamBuffDbKeyHash160ColDefaultFactory
	implements ICFBamDbKeyHash160ColFactory
{
	public CFBamBuffDbKeyHash160ColDefaultFactory() {
	}

	@Override
	public ICFBamDbKeyHash160ColByTableIdxKey newByTableIdxKey() {
		ICFBamDbKeyHash160ColByTableIdxKey key =
			new CFBamBuffDbKeyHash160ColByTableIdxKey();
		return( key );
	}

	public CFBamBuffDbKeyHash160ColByTableIdxKey ensureByTableIdxKey(ICFBamDbKeyHash160ColByTableIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffDbKeyHash160ColByTableIdxKey) {
			return( (CFBamBuffDbKeyHash160ColByTableIdxKey)key );
		}
		else {
			CFBamBuffDbKeyHash160ColByTableIdxKey mapped = new CFBamBuffDbKeyHash160ColByTableIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamDbKeyHash160Col newRec() {
		ICFBamDbKeyHash160Col rec =
			new CFBamBuffDbKeyHash160Col();
		return( rec );
	}

	public CFBamBuffDbKeyHash160Col ensureRec(ICFBamDbKeyHash160Col rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof CFBamBuffDbKeyHash160Col) {
			return( (CFBamBuffDbKeyHash160Col)rec );
		}
		else {
			CFBamBuffDbKeyHash160Col mapped = new CFBamBuffDbKeyHash160Col();
			mapped.set(rec);
			return( mapped );
		}
	}

	@Override
	public ICFBamDbKeyHash160ColH newHRec() {
		ICFBamDbKeyHash160ColH hrec =
			new CFBamBuffDbKeyHash160ColH();
		return( hrec );
	}

	public CFBamBuffDbKeyHash160ColH ensureHRec(ICFBamDbKeyHash160ColH hrec) {
		if (hrec == null) {
			return( null );
		}
		else if( hrec instanceof CFBamBuffDbKeyHash160ColH) {
			return( (CFBamBuffDbKeyHash160ColH)hrec );
		}
		else {
			CFBamBuffDbKeyHash160ColH mapped = new CFBamBuffDbKeyHash160ColH();
			mapped.set(hrec);
			return( mapped );
		}
	}
}
