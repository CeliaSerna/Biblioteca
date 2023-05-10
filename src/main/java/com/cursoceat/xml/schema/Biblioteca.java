//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.05.09 a las 11:44:29 AM CEST 
//


package com.cursoceat.xml.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="libros" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="publicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="paginas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "libros"
})
@XmlRootElement(name = "biblioteca")
public class Biblioteca {

    @XmlElement(required = true)
    protected List<Biblioteca.Libros> libros;

    /**
     * Gets the value of the libros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the libros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Biblioteca.Libros }
     * 
     * 
     */
    public List<Biblioteca.Libros> getLibros() {
        if (libros == null) {
            libros = new ArrayList<Biblioteca.Libros>();
        }
        return this.libros;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="publicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="paginas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "titulo",
        "autor",
        "genero",
        "publicacion",
        "paginas"
    })
    public static class Libros {

        @XmlElement(required = true)
        protected String titulo;
        @XmlElement(required = true)
        protected String autor;
        @XmlElement(required = true)
        protected String genero;
        @XmlElement(required = true)
        protected String publicacion;
        protected int paginas;
        @XmlAttribute(name = "id")
        protected Integer id;

        /**
         * Obtiene el valor de la propiedad titulo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitulo() {
            return titulo;
        }

        /**
         * Define el valor de la propiedad titulo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitulo(String value) {
            this.titulo = value;
        }

        /**
         * Obtiene el valor de la propiedad autor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAutor() {
            return autor;
        }

        /**
         * Define el valor de la propiedad autor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAutor(String value) {
            this.autor = value;
        }

        /**
         * Obtiene el valor de la propiedad genero.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGenero() {
            return genero;
        }

        /**
         * Define el valor de la propiedad genero.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGenero(String value) {
            this.genero = value;
        }

        /**
         * Obtiene el valor de la propiedad publicacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPublicacion() {
            return publicacion;
        }

        /**
         * Define el valor de la propiedad publicacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublicacion(String value) {
            this.publicacion = value;
        }

        /**
         * Obtiene el valor de la propiedad paginas.
         * 
         */
        public int getPaginas() {
            return paginas;
        }

        /**
         * Define el valor de la propiedad paginas.
         * 
         */
        public void setPaginas(int value) {
            this.paginas = value;
        }

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setId(Integer value) {
            this.id = value;
        }

    }

}
