
// Description: Java 25 Default Factory implementation for Id64Gen buffers

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
 *	CFBamBuffId64GenFactory implementation of ICFBamId64GenFactory for Id64Gen
 */
public class CFBamBuffId64GenDefaultFactory
	implements ICFBamId64GenFactory
{
	public CFBamBuffId64GenDefaultFactory() {
	}

	@Override
	public ICFBamId64Gen newRec() {
		ICFBamId64Gen rec =
			new CFBamBuffId64Gen();
		return( rec );
	}

	public CFBamBuffId64Gen ensureRec(ICFBamId64Gen rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof CFBamBuffId64Gen) {
			return( (CFBamBuffId64Gen)rec );
		}
		else {
			CFBamBuffId64Gen mapped = new CFBamBuffId64Gen();
			mapped.set(rec);
			return( mapped );
		}
	}

	@Override
	public ICFBamId64GenH newHRec() {
		ICFBamId64GenH hrec =
			new CFBamBuffId64GenH();
		return( hrec );
	}

	public CFBamBuffId64GenH ensureHRec(ICFBamId64GenH hrec) {
		if (hrec == null) {
			return( null );
		}
		else if( hrec instanceof CFBamBuffId64GenH) {
			return( (CFBamBuffId64GenH)hrec );
		}
		else {
			CFBamBuffId64GenH mapped = new CFBamBuffId64GenH();
			mapped.set(hrec);
			return( mapped );
		}
	}
}
