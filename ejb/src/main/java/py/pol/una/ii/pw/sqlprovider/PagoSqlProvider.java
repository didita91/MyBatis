package py.pol.una.ii.pw.sqlprovider;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.List;
import java.util.Map;

import py.pol.una.ii.pw.example.PagoExample;
import py.pol.una.ii.pw.example.PagoExample.Criteria;
import py.pol.una.ii.pw.example.PagoExample.Criterion;
import py.pol.una.ii.pw.model.Pago;

public class PagoSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.pago
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    public String countByExample(PagoExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("pago");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.pago
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    public String deleteByExample(PagoExample example) {
        BEGIN();
        DELETE_FROM("pago");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.pago
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    public String insertSelective(Pago record) {
        BEGIN();
        INSERT_INTO("pago");
        
        if (record.getIdPago() != null) {
            VALUES("id_pago", "#{idPago,jdbcType=INTEGER}");
        }
        
        if (record.getIdCliente() != null) {
            VALUES("id_cliente", "#{idCliente,jdbcType=INTEGER}");
        }
        
        if (record.getFecha() != null) {
            VALUES("fecha", "#{fecha,jdbcType=DATE}");
        }
        
        if (record.getPago() != null) {
            VALUES("pago", "#{pago,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.pago
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    public String selectByExample(PagoExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id_pago");
        } else {
            SELECT("id_pago");
        }
        SELECT("id_cliente");
        SELECT("fecha");
        SELECT("pago");
        FROM("pago");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.pago
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Pago record = (Pago) parameter.get("record");
        PagoExample example = (PagoExample) parameter.get("example");
        
        BEGIN();
        UPDATE("pago");
        
        if (record.getIdPago() != null) {
            SET("id_pago = #{record.idPago,jdbcType=INTEGER}");
        }
        
        if (record.getIdCliente() != null) {
            SET("id_cliente = #{record.idCliente,jdbcType=INTEGER}");
        }
        
        if (record.getFecha() != null) {
            SET("fecha = #{record.fecha,jdbcType=DATE}");
        }
        
        if (record.getPago() != null) {
            SET("pago = #{record.pago,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.pago
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("pago");
        
        SET("id_pago = #{record.idPago,jdbcType=INTEGER}");
        SET("id_cliente = #{record.idCliente,jdbcType=INTEGER}");
        SET("fecha = #{record.fecha,jdbcType=DATE}");
        SET("pago = #{record.pago,jdbcType=INTEGER}");
        
        PagoExample example = (PagoExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.pago
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    public String updateByPrimaryKeySelective(Pago record) {
        BEGIN();
        UPDATE("pago");
        
        if (record.getIdCliente() != null) {
            SET("id_cliente = #{idCliente,jdbcType=INTEGER}");
        }
        
        if (record.getFecha() != null) {
            SET("fecha = #{fecha,jdbcType=DATE}");
        }
        
        if (record.getPago() != null) {
            SET("pago = #{pago,jdbcType=INTEGER}");
        }
        
        WHERE("id_pago = #{idPago,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.pago
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    protected void applyWhere(PagoExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}