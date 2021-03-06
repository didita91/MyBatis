package py.pol.una.ii.pw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import py.pol.una.ii.pw.example.CompraExample;
import py.pol.una.ii.pw.model.Compra;
import py.pol.una.ii.pw.sqlprovider.CompraSqlProvider;

public interface CompraMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.compra
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    @SelectProvider(type=CompraSqlProvider.class, method="countByExample")
    int countByExample(CompraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.compra
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    @DeleteProvider(type=CompraSqlProvider.class, method="deleteByExample")
    int deleteByExample(CompraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.compra
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    @Delete({
        "delete from compra",
        "where id_compra = #{idCompra,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idCompra);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.compra
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    @Insert({
        "insert into compra (id_compra, id_proveedor, ",
        "fecha)",
        "values (#{idCompra,jdbcType=INTEGER}, #{idProveedor,jdbcType=INTEGER}, ",
        "#{fecha,jdbcType=DATE})"
    })
    int insert(Compra record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.compra
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    @InsertProvider(type=CompraSqlProvider.class, method="insertSelective")
    int insertSelective(Compra record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.compra
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    @SelectProvider(type=CompraSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_compra", property="idCompra", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="id_proveedor", property="idProveedor", jdbcType=JdbcType.INTEGER),
        @Result(column="fecha", property="fecha", jdbcType=JdbcType.DATE)
    })
    List<Compra> selectByExample(CompraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.compra
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    @Select({
        "select",
        "id_compra, id_proveedor, fecha",
        "from compra",
        "where id_compra = #{idCompra,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id_compra", property="idCompra", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="id_proveedor", property="idProveedor", jdbcType=JdbcType.INTEGER),
        @Result(column="fecha", property="fecha", jdbcType=JdbcType.DATE)
    })
    Compra selectByPrimaryKey(Integer idCompra);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.compra
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    @UpdateProvider(type=CompraSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Compra record, @Param("example") CompraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.compra
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    @UpdateProvider(type=CompraSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Compra record, @Param("example") CompraExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.compra
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    @UpdateProvider(type=CompraSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Compra record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.compra
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    @Update({
        "update compra",
        "set id_proveedor = #{idProveedor,jdbcType=INTEGER},",
          "fecha = #{fecha,jdbcType=DATE}",
        "where id_compra = #{idCompra,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Compra record);
}