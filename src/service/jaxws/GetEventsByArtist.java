
package service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Fri Apr 16 21:58:03 CEST 2021
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "getEventsByArtist", namespace = "http://service/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEventsByArtist", namespace = "http://service/")

public class GetEventsByArtist {

    @XmlElement(name = "artist")
    private model.Artist artist;

    public model.Artist getArtist() {
        return this.artist;
    }

    public void setArtist(model.Artist newArtist)  {
        this.artist = newArtist;
    }

}

