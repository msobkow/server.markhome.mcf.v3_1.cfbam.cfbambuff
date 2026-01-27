
// Description: Java 25 Default Factory implementation for Table buffers

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
 *	CFBamBuffTableFactory implementation of ICFBamTableFactory for Table
 */
public class CFBamBuffTableDefaultFactory
	implements ICFBamTableFactory
{
	public CFBamBuffTableDefaultFactory() {
	}

	@Override
	public ICFBamTableBySchemaDefIdxKey newBySchemaDefIdxKey() {
		ICFBamTableBySchemaDefIdxKey key =
			new CFBamBuffTableBySchemaDefIdxKey();
		return( key );
	}

	public CFBamBuffTableBySchemaDefIdxKey ensureBySchemaDefIdxKey(ICFBamTableBySchemaDefIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffTableBySchemaDefIdxKey) {
			return( (CFBamBuffTableBySchemaDefIdxKey)key );
		}
		else {
			CFBamBuffTableBySchemaDefIdxKey mapped = new CFBamBuffTableBySchemaDefIdxKey();
			mapped.setRequiredSchemaDefId( key.getRequiredSchemaDefId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamTableByDefSchemaIdxKey newByDefSchemaIdxKey() {
		ICFBamTableByDefSchemaIdxKey key =
			new CFBamBuffTableByDefSchemaIdxKey();
		return( key );
	}

	public CFBamBuffTableByDefSchemaIdxKey ensureByDefSchemaIdxKey(ICFBamTableByDefSchemaIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffTableByDefSchemaIdxKey) {
			return( (CFBamBuffTableByDefSchemaIdxKey)key );
		}
		else {
			CFBamBuffTableByDefSchemaIdxKey mapped = new CFBamBuffTableByDefSchemaIdxKey();
			mapped.setOptionalDefSchemaId( key.getOptionalDefSchemaId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamTableByUNameIdxKey newByUNameIdxKey() {
		ICFBamTableByUNameIdxKey key =
			new CFBamBuffTableByUNameIdxKey();
		return( key );
	}

	public CFBamBuffTableByUNameIdxKey ensureByUNameIdxKey(ICFBamTableByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffTableByUNameIdxKey) {
			return( (CFBamBuffTableByUNameIdxKey)key );
		}
		else {
			CFBamBuffTableByUNameIdxKey mapped = new CFBamBuffTableByUNameIdxKey();
			mapped.setRequiredSchemaDefId( key.getRequiredSchemaDefId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

	@Override
	public ICFBamTableBySchemaCdIdxKey newBySchemaCdIdxKey() {
		ICFBamTableBySchemaCdIdxKey key =
			new CFBamBuffTableBySchemaCdIdxKey();
		return( key );
	}

	public CFBamBuffTableBySchemaCdIdxKey ensureBySchemaCdIdxKey(ICFBamTableBySchemaCdIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffTableBySchemaCdIdxKey) {
			return( (CFBamBuffTableBySchemaCdIdxKey)key );
		}
		else {
			CFBamBuffTableBySchemaCdIdxKey mapped = new CFBamBuffTableBySchemaCdIdxKey();
			mapped.setRequiredSchemaDefId( key.getRequiredSchemaDefId() );
			mapped.setRequiredTableClassCode( key.getRequiredTableClassCode() );
			return( mapped );
		}
	}

	@Override
	public ICFBamTableByPrimaryIndexIdxKey newByPrimaryIndexIdxKey() {
		ICFBamTableByPrimaryIndexIdxKey key =
			new CFBamBuffTableByPrimaryIndexIdxKey();
		return( key );
	}

	public CFBamBuffTableByPrimaryIndexIdxKey ensureByPrimaryIndexIdxKey(ICFBamTableByPrimaryIndexIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffTableByPrimaryIndexIdxKey) {
			return( (CFBamBuffTableByPrimaryIndexIdxKey)key );
		}
		else {
			CFBamBuffTableByPrimaryIndexIdxKey mapped = new CFBamBuffTableByPrimaryIndexIdxKey();
			mapped.setOptionalPrimaryIndexId( key.getOptionalPrimaryIndexId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamTableByLookupIndexIdxKey newByLookupIndexIdxKey() {
		ICFBamTableByLookupIndexIdxKey key =
			new CFBamBuffTableByLookupIndexIdxKey();
		return( key );
	}

	public CFBamBuffTableByLookupIndexIdxKey ensureByLookupIndexIdxKey(ICFBamTableByLookupIndexIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffTableByLookupIndexIdxKey) {
			return( (CFBamBuffTableByLookupIndexIdxKey)key );
		}
		else {
			CFBamBuffTableByLookupIndexIdxKey mapped = new CFBamBuffTableByLookupIndexIdxKey();
			mapped.setOptionalLookupIndexId( key.getOptionalLookupIndexId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamTableByAltIndexIdxKey newByAltIndexIdxKey() {
		ICFBamTableByAltIndexIdxKey key =
			new CFBamBuffTableByAltIndexIdxKey();
		return( key );
	}

	public CFBamBuffTableByAltIndexIdxKey ensureByAltIndexIdxKey(ICFBamTableByAltIndexIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffTableByAltIndexIdxKey) {
			return( (CFBamBuffTableByAltIndexIdxKey)key );
		}
		else {
			CFBamBuffTableByAltIndexIdxKey mapped = new CFBamBuffTableByAltIndexIdxKey();
			mapped.setOptionalAltIndexId( key.getOptionalAltIndexId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamTableByQualTableIdxKey newByQualTableIdxKey() {
		ICFBamTableByQualTableIdxKey key =
			new CFBamBuffTableByQualTableIdxKey();
		return( key );
	}

	public CFBamBuffTableByQualTableIdxKey ensureByQualTableIdxKey(ICFBamTableByQualTableIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffTableByQualTableIdxKey) {
			return( (CFBamBuffTableByQualTableIdxKey)key );
		}
		else {
			CFBamBuffTableByQualTableIdxKey mapped = new CFBamBuffTableByQualTableIdxKey();
			mapped.setOptionalQualifyingTableId( key.getOptionalQualifyingTableId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamTable newRec() {
		ICFBamTable rec =
			new CFBamBuffTable();
		return( rec );
	}

	public CFBamBuffTable ensureRec(ICFBamTable rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof CFBamBuffTable) {
			return( (CFBamBuffTable)rec );
		}
		else {
			CFBamBuffTable mapped = new CFBamBuffTable();
			mapped.set(rec);
			return( mapped );
		}
	}

	@Override
	public ICFBamTableH newHRec() {
		ICFBamTableH hrec =
			new CFBamBuffTableH();
		return( hrec );
	}

	public CFBamBuffTableH ensureHRec(ICFBamTableH hrec) {
		if (hrec == null) {
			return( null );
		}
		else if( hrec instanceof CFBamBuffTableH) {
			return( (CFBamBuffTableH)hrec );
		}
		else {
			CFBamBuffTableH mapped = new CFBamBuffTableH();
			mapped.set(hrec);
			return( mapped );
		}
	}
}
