package py.pol.una.ii.pw.model;

public class VentaDetalle {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.venta_detalle.id_venta_detalle
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    private Integer idVentaDetalle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.venta_detalle.id_venta
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    private Integer idVenta;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.venta_detalle.id_producto
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    private Integer idProducto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.venta_detalle.cantidad
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    private Integer cantidad;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.venta_detalle.id_venta_detalle
     *
     * @return the value of public.venta_detalle.id_venta_detalle
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    public Integer getIdVentaDetalle() {
        return idVentaDetalle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.venta_detalle.id_venta_detalle
     *
     * @param idVentaDetalle the value for public.venta_detalle.id_venta_detalle
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    public void setIdVentaDetalle(Integer idVentaDetalle) {
        this.idVentaDetalle = idVentaDetalle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.venta_detalle.id_venta
     *
     * @return the value of public.venta_detalle.id_venta
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    public Integer getIdVenta() {
        return idVenta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.venta_detalle.id_venta
     *
     * @param idVenta the value for public.venta_detalle.id_venta
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.venta_detalle.id_producto
     *
     * @return the value of public.venta_detalle.id_producto
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    public Integer getIdProducto() {
        return idProducto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.venta_detalle.id_producto
     *
     * @param idProducto the value for public.venta_detalle.id_producto
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.venta_detalle.cantidad
     *
     * @return the value of public.venta_detalle.cantidad
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.venta_detalle.cantidad
     *
     * @param cantidad the value for public.venta_detalle.cantidad
     *
     * @mbggenerated Sat Apr 23 22:10:07 PYT 2016
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}