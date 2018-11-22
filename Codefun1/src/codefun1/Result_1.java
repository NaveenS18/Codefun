/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefun1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author navee
 */
@Entity
@Table(name = "result", catalog = "code", schema = "")
@NamedQueries({
    @NamedQuery(name = "Result_1.findAll", query = "SELECT r FROM Result_1 r")
    , @NamedQuery(name = "Result_1.findByRanking", query = "SELECT r FROM Result_1 r WHERE r.ranking = :ranking")
    , @NamedQuery(name = "Result_1.findByUsername", query = "SELECT r FROM Result_1 r WHERE r.username = :username")
    , @NamedQuery(name = "Result_1.findByLanguage", query = "SELECT r FROM Result_1 r WHERE r.language = :language")})
public class Result_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Ranking")
    private int ranking;
    @Id
    @Basic(optional = false)
    @Column(name = "Username")
    private String username;
    @Column(name = "Language")
    private String language;

    public Result_1() {
    }

    public Result_1(String username) {
        this.username = username;
    }

    public Result_1(String username, int ranking) {
        this.username = username;
        this.ranking = ranking;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        int oldRanking = this.ranking;
        this.ranking = ranking;
        changeSupport.firePropertyChange("ranking", oldRanking, ranking);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        String oldLanguage = this.language;
        this.language = language;
        changeSupport.firePropertyChange("language", oldLanguage, language);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Result_1)) {
            return false;
        }
        Result_1 other = (Result_1) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "codefun1.Result_1[ username=" + username + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
