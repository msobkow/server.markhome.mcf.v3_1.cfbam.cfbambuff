
// Description: Java 25 Default Factory implementation for Relation buffers

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
 *	CFBamBuffRelationFactory implementation of ICFBamRelationFactory for Relation
 */
public class CFBamBuffRelationDefaultFactory
	implements ICFBamRelationFactory
{
	public CFBamBuffRelationDefaultFactory() {
	}

	@Override
	public ICFBamRelationByUNameIdxKey newByUNameIdxKey() {
		ICFBamRelationByUNameIdxKey key =
			new CFBamBuffRelationByUNameIdxKey();
		return( key );
	}

	public CFBamBuffRelationByUNameIdxKey ensureByUNameIdxKey(ICFBamRelationByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffRelationByUNameIdxKey) {
			return( (CFBamBuffRelationByUNameIdxKey)key );
		}
		else {
			CFBamBuffRelationByUNameIdxKey mapped = new CFBamBuffRelationByUNameIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

	@Override
	public ICFBamRelationByRelTableIdxKey newByRelTableIdxKey() {
		ICFBamRelationByRelTableIdxKey key =
			new CFBamBuffRelationByRelTableIdxKey();
		return( key );
	}

	public CFBamBuffRelationByRelTableIdxKey ensureByRelTableIdxKey(ICFBamRelationByRelTableIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffRelationByRelTableIdxKey) {
			return( (CFBamBuffRelationByRelTableIdxKey)key );
		}
		else {
			CFBamBuffRelationByRelTableIdxKey mapped = new CFBamBuffRelationByRelTableIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamRelationByDefSchemaIdxKey newByDefSchemaIdxKey() {
		ICFBamRelationByDefSchemaIdxKey key =
			new CFBamBuffRelationByDefSchemaIdxKey();
		return( key );
	}

	public CFBamBuffRelationByDefSchemaIdxKey ensureByDefSchemaIdxKey(ICFBamRelationByDefSchemaIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffRelationByDefSchemaIdxKey) {
			return( (CFBamBuffRelationByDefSchemaIdxKey)key );
		}
		else {
			CFBamBuffRelationByDefSchemaIdxKey mapped = new CFBamBuffRelationByDefSchemaIdxKey();
			mapped.setOptionalDefSchemaId( key.getOptionalDefSchemaId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamRelationByFromKeyIdxKey newByFromKeyIdxKey() {
		ICFBamRelationByFromKeyIdxKey key =
			new CFBamBuffRelationByFromKeyIdxKey();
		return( key );
	}

	public CFBamBuffRelationByFromKeyIdxKey ensureByFromKeyIdxKey(ICFBamRelationByFromKeyIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffRelationByFromKeyIdxKey) {
			return( (CFBamBuffRelationByFromKeyIdxKey)key );
		}
		else {
			CFBamBuffRelationByFromKeyIdxKey mapped = new CFBamBuffRelationByFromKeyIdxKey();
			mapped.setRequiredFromIndexId( key.getRequiredFromIndexId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamRelationByToTblIdxKey newByToTblIdxKey() {
		ICFBamRelationByToTblIdxKey key =
			new CFBamBuffRelationByToTblIdxKey();
		return( key );
	}

	public CFBamBuffRelationByToTblIdxKey ensureByToTblIdxKey(ICFBamRelationByToTblIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffRelationByToTblIdxKey) {
			return( (CFBamBuffRelationByToTblIdxKey)key );
		}
		else {
			CFBamBuffRelationByToTblIdxKey mapped = new CFBamBuffRelationByToTblIdxKey();
			mapped.setRequiredToTableId( key.getRequiredToTableId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamRelationByToKeyIdxKey newByToKeyIdxKey() {
		ICFBamRelationByToKeyIdxKey key =
			new CFBamBuffRelationByToKeyIdxKey();
		return( key );
	}

	public CFBamBuffRelationByToKeyIdxKey ensureByToKeyIdxKey(ICFBamRelationByToKeyIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffRelationByToKeyIdxKey) {
			return( (CFBamBuffRelationByToKeyIdxKey)key );
		}
		else {
			CFBamBuffRelationByToKeyIdxKey mapped = new CFBamBuffRelationByToKeyIdxKey();
			mapped.setRequiredToIndexId( key.getRequiredToIndexId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamRelationByNarrowedIdxKey newByNarrowedIdxKey() {
		ICFBamRelationByNarrowedIdxKey key =
			new CFBamBuffRelationByNarrowedIdxKey();
		return( key );
	}

	public CFBamBuffRelationByNarrowedIdxKey ensureByNarrowedIdxKey(ICFBamRelationByNarrowedIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffRelationByNarrowedIdxKey) {
			return( (CFBamBuffRelationByNarrowedIdxKey)key );
		}
		else {
			CFBamBuffRelationByNarrowedIdxKey mapped = new CFBamBuffRelationByNarrowedIdxKey();
			mapped.setOptionalNarrowedId( key.getOptionalNarrowedId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamRelation newRec() {
		ICFBamRelation rec =
			new CFBamBuffRelation();
		return( rec );
	}

	public CFBamBuffRelation ensureRec(ICFBamRelation rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof CFBamBuffRelation) {
			return( (CFBamBuffRelation)rec );
		}
		else {
			CFBamBuffRelation mapped = new CFBamBuffRelation();
			mapped.set(rec);
			return( mapped );
		}
	}

	@Override
	public ICFBamRelationH newHRec() {
		ICFBamRelationH hrec =
			new CFBamBuffRelationH();
		return( hrec );
	}

	public CFBamBuffRelationH ensureHRec(ICFBamRelationH hrec) {
		if (hrec == null) {
			return( null );
		}
		else if( hrec instanceof CFBamBuffRelationH) {
			return( (CFBamBuffRelationH)hrec );
		}
		else {
			CFBamBuffRelationH mapped = new CFBamBuffRelationH();
			mapped.set(hrec);
			return( mapped );
		}
	}
}
