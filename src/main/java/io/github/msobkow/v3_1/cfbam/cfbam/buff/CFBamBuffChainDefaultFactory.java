
// Description: Java 25 Default Factory implementation for Chain buffers

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
 *	CFBamBuffChainFactory implementation of ICFBamChainFactory for Chain
 */
public class CFBamBuffChainDefaultFactory
	implements ICFBamChainFactory
{
	public CFBamBuffChainDefaultFactory() {
	}

	@Override
	public ICFBamChainHPKey newHPKey() {
		ICFBamChainHPKey hpkey =
			new CFBamBuffChainHPKey();
		return( hpkey );
	}

	public CFBamBuffChainHPKey ensureHPKey(ICFBamChainHPKey key) {
		if (key == null) {
			return( null );
		}
		else if( key instanceof CFBamBuffChainHPKey) {
			return( (CFBamBuffChainHPKey)key );
		}
		else {
			CFBamBuffChainHPKey mapped = new CFBamBuffChainHPKey();
			mapped.setAuditClusterId(key.getAuditClusterId());
			mapped.setAuditActionId(key.getAuditActionId());
			mapped.setAuditSessionId(key.getAuditSessionId());
			mapped.setAuditStamp(key.getAuditStamp());
			mapped.setRequiredId( key.getRequiredId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamChainByChainTableIdxKey newByChainTableIdxKey() {
		ICFBamChainByChainTableIdxKey key =
			new CFBamBuffChainByChainTableIdxKey();
		return( key );
	}

	public CFBamBuffChainByChainTableIdxKey ensureByChainTableIdxKey(ICFBamChainByChainTableIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffChainByChainTableIdxKey) {
			return( (CFBamBuffChainByChainTableIdxKey)key );
		}
		else {
			CFBamBuffChainByChainTableIdxKey mapped = new CFBamBuffChainByChainTableIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamChainByDefSchemaIdxKey newByDefSchemaIdxKey() {
		ICFBamChainByDefSchemaIdxKey key =
			new CFBamBuffChainByDefSchemaIdxKey();
		return( key );
	}

	public CFBamBuffChainByDefSchemaIdxKey ensureByDefSchemaIdxKey(ICFBamChainByDefSchemaIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffChainByDefSchemaIdxKey) {
			return( (CFBamBuffChainByDefSchemaIdxKey)key );
		}
		else {
			CFBamBuffChainByDefSchemaIdxKey mapped = new CFBamBuffChainByDefSchemaIdxKey();
			mapped.setOptionalDefSchemaId( key.getOptionalDefSchemaId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamChainByUNameIdxKey newByUNameIdxKey() {
		ICFBamChainByUNameIdxKey key =
			new CFBamBuffChainByUNameIdxKey();
		return( key );
	}

	public CFBamBuffChainByUNameIdxKey ensureByUNameIdxKey(ICFBamChainByUNameIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffChainByUNameIdxKey) {
			return( (CFBamBuffChainByUNameIdxKey)key );
		}
		else {
			CFBamBuffChainByUNameIdxKey mapped = new CFBamBuffChainByUNameIdxKey();
			mapped.setRequiredTableId( key.getRequiredTableId() );
			mapped.setRequiredName( key.getRequiredName() );
			return( mapped );
		}
	}

	@Override
	public ICFBamChainByPrevRelIdxKey newByPrevRelIdxKey() {
		ICFBamChainByPrevRelIdxKey key =
			new CFBamBuffChainByPrevRelIdxKey();
		return( key );
	}

	public CFBamBuffChainByPrevRelIdxKey ensureByPrevRelIdxKey(ICFBamChainByPrevRelIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffChainByPrevRelIdxKey) {
			return( (CFBamBuffChainByPrevRelIdxKey)key );
		}
		else {
			CFBamBuffChainByPrevRelIdxKey mapped = new CFBamBuffChainByPrevRelIdxKey();
			mapped.setRequiredPrevRelationId( key.getRequiredPrevRelationId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamChainByNextRelIdxKey newByNextRelIdxKey() {
		ICFBamChainByNextRelIdxKey key =
			new CFBamBuffChainByNextRelIdxKey();
		return( key );
	}

	public CFBamBuffChainByNextRelIdxKey ensureByNextRelIdxKey(ICFBamChainByNextRelIdxKey key) {
		if (key == null) {
			return( null );
		}
		else if (key instanceof CFBamBuffChainByNextRelIdxKey) {
			return( (CFBamBuffChainByNextRelIdxKey)key );
		}
		else {
			CFBamBuffChainByNextRelIdxKey mapped = new CFBamBuffChainByNextRelIdxKey();
			mapped.setRequiredNextRelationId( key.getRequiredNextRelationId() );
			return( mapped );
		}
	}

	@Override
	public ICFBamChain newRec() {
		ICFBamChain rec =
			new CFBamBuffChain();
		return( rec );
	}

	public CFBamBuffChain ensureRec(ICFBamChain rec) {
		if( rec == null ) {
			return( null );
		}
		else if (rec instanceof CFBamBuffChain) {
			return( (CFBamBuffChain)rec );
		}
		else {
			CFBamBuffChain mapped = new CFBamBuffChain();
			mapped.set(rec);
			return( mapped );
		}
	}

	@Override
	public ICFBamChainH newHRec() {
		ICFBamChainH hrec =
			new CFBamBuffChainH();
		return( hrec );
	}

	public CFBamBuffChainH ensureHRec(ICFBamChainH hrec) {
		if (hrec == null) {
			return( null );
		}
		else if( hrec instanceof CFBamBuffChainH) {
			return( (CFBamBuffChainH)hrec );
		}
		else {
			CFBamBuffChainH mapped = new CFBamBuffChainH();
			mapped.set(hrec);
			return( mapped );
		}
	}
}
