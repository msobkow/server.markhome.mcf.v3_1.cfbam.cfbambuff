
// Description: Java 25 Default Factory implementation for DbKeyHash128Col buffers

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
 *	CFBamBuffDbKeyHash128ColFactory implementation of ICFBamDbKeyHash128ColFactory for DbKeyHash128Col
 */
public class CFBamBuffDbKeyHash128ColDefaultFactory
	implements ICFBamDbKeyHash128ColFactory
{
	public CFBamBuffDbKeyHash128ColDefaultFactory() {
	}

	@Override
	public ICFBamDbKeyHash128ColByTableIdxKey newByTableIdxKey() {
		ICFBamDbKeyHash128ColByTableIdxKey key =
			new CFBamBuffDbKeyHash128ColByTableIdxKey();
		return( key );
	}

	public CFBamBuffDbKeyHash128ColByTableIdxKey ensureByTableIdxKey(ICFBamDbKeyHash128ColByTableIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffDbKeyHash128ColByTableIdxKey) {
			return( (CFBamBuffDbKeyHash128ColByTableIdxKey)key );
		}
		else {
			CFBamBuffDbKeyHash128ColByTableIdxKey mapped = new CFBamBuffDbKeyHash128ColByTableIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamDbKeyHash128Col newRec() {
		ICFBamDbKeyHash128Col rec =
			new CFBamBuffDbKeyHash128Col();
		return( rec );
	}

	public CFBamBuffDbKeyHash128Col ensureRec(ICFBamDbKeyHash128Col rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof CFBamBuffDbKeyHash128Col) {
			return( (CFBamBuffDbKeyHash128Col)rec );
		}
		else {
			CFBamBuffDbKeyHash128Col mapped = new CFBamBuffDbKeyHash128Col();
			mapped.set(rec);
			return( mapped );
		}
	}

	@Override
	public ICFBamDbKeyHash128ColH newHRec() {
		ICFBamDbKeyHash128ColH hrec =
			new CFBamBuffDbKeyHash128ColH();
		return( hrec );
	}

	public CFBamBuffDbKeyHash128ColH ensureHRec(ICFBamDbKeyHash128ColH hrec) {
		if (hrec == null) {
			return( null );
		}
		else if( hrec instanceof CFBamBuffDbKeyHash128ColH) {
			return( (CFBamBuffDbKeyHash128ColH)hrec );
		}
		else {
			CFBamBuffDbKeyHash128ColH mapped = new CFBamBuffDbKeyHash128ColH();
			mapped.set(hrec);
			return( mapped );
		}
	}
}
