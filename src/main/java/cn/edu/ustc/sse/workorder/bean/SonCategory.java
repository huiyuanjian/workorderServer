package cn.edu.ustc.sse.workorder.bean;

public class SonCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column soncategory.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column soncategory.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column soncategory.paraentID
     *
     * @mbg.generated
     */
    private Integer paraentid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column soncategory.id
     *
     * @return the value of soncategory.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column soncategory.id
     *
     * @param id the value for soncategory.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column soncategory.name
     *
     * @return the value of soncategory.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column soncategory.name
     *
     * @param name the value for soncategory.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column soncategory.paraentID
     *
     * @return the value of soncategory.paraentID
     *
     * @mbg.generated
     */
    public Integer getParaentid() {
        return paraentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column soncategory.paraentID
     *
     * @param paraentid the value for soncategory.paraentID
     *
     * @mbg.generated
     */
    public void setParaentid(Integer paraentid) {
        this.paraentid = paraentid;
    }
}