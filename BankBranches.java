/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rj3696
 */
@Entity
@Table(name = "bank_branches")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BankBranches.findAll", query = "SELECT b FROM BankBranches b")
    , @NamedQuery(name = "BankBranches.findByIfsc", query = "SELECT b FROM BankBranches b WHERE b.ifsc = :ifsc")
    , @NamedQuery(name = "BankBranches.findByBankId", query = "SELECT b FROM BankBranches b WHERE b.bankId = :bankId")
    , @NamedQuery(name = "BankBranches.findByBranch", query = "SELECT b FROM BankBranches b WHERE b.branch = :branch")
    , @NamedQuery(name = "BankBranches.findByAddress", query = "SELECT b FROM BankBranches b WHERE b.address = :address")
    , @NamedQuery(name = "BankBranches.findByCity", query = "SELECT b FROM BankBranches b WHERE b.city = :city")
    , @NamedQuery(name = "BankBranches.findByDistrict", query = "SELECT b FROM BankBranches b WHERE b.district = :district")
    , @NamedQuery(name = "BankBranches.findByState", query = "SELECT b FROM BankBranches b WHERE b.state = :state")
})
public class BankBranches implements Serializable {

    @Size(max = 49)
    @Column(name = "bank_name")
    private String bankName;

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "ifsc")
    @Id
    private String ifsc;
    @Column(name = "bank_id")
    private BigInteger bankId;
    @Size(max = 74)
    @Column(name = "branch")
    private String branch;
    @Size(max = 195)
    @Column(name = "address")
    private String address;
    @Size(max = 50)
    @Column(name = "city")
    private String city;
    @Size(max = 50)
    @Column(name = "district")
    private String district;
    @Size(max = 26)
    @Column(name = "state")
    private String state;
    @Size(max = 49)
    
    public BankBranches() {
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public BigInteger getBankId() {
        return bankId;
    }

    public void setBankId(BigInteger bankId) {
        this.bankId = bankId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
