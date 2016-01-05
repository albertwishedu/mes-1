package com.qcadoo.mes.materialFlowResources.mappers;

import com.qcadoo.mes.materialFlowResources.DocumentPositionDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class DocumentPositionMapper implements RowMapper {

    @Override
    public DocumentPositionDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        DocumentPositionDTO positionVO = new DocumentPositionDTO();

        positionVO.setId(resultSet.getLong("id"));
        positionVO.setNumber(resultSet.getInt("number"));

        positionVO.setProduct(resultSet.getString("product_number"));
        positionVO.setUnit(resultSet.getString("product_unit"));
        // nowe pole
        positionVO.setAdditionalCode(resultSet.getString("additionalcode_code"));
        positionVO.setQuantity(resultSet.getBigDecimal("quantity"));
        positionVO.setGivenquantity(resultSet.getBigDecimal("givenquantity"));
        positionVO.setGivenunit(resultSet.getString("givenunit"));
        // nowe pole
        positionVO.setConversion(resultSet.getBigDecimal("conversion"));
        positionVO.setExpirationdate(resultSet.getDate("expirationdate"));
        // nowe pole
        positionVO.setPalletNumber(resultSet.getString("palletnumber_number"));
        // nowe pole
        positionVO.setTypeOfPallet(resultSet.getString("typeofpallet"));
        positionVO.setStorageLocation(resultSet.getString("storagelocation_number"));
        positionVO.setDocument(resultSet.getLong("document_id"));
        positionVO.setProductiondate(resultSet.getDate("productiondate"));
        positionVO.setPrice(resultSet.getBigDecimal("price"));
        positionVO.setBatch(resultSet.getString("batch"));
        

//        <string name="unit" persistent="false"/>
//
//        <priority name="number" scope="document"/>
//        <hasMany name="attributeValues" joinField="position" model="attributeValue" cascade="delete"/>
//
//
//        <enum name="type" values="01receipt,02internalInbound,03internalOutbound,04release,05transfer"/>
//        <enum name="state" values="01draft,02accepted" default="01draft"/>    
        return positionVO;
    }
}