package devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.websocket.Decoder.Text;

@Entity
@Table(name = "tb_game")
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String  litle;
	@Column(name="game_year")
	private Integer year;
	private String genre;
	private String platform;
	private Double score;
	private String imgUrl;
	@Column(columnDefinition = "TEXT")
	private String shorDescription;
	@Column(columnDefinition = "TEXT")
	private String longDescription;
	
	public Game() {
		}

	public Game(Long id, String litle, Integer year, String genre, String platform, Double score, String imgUrl,
			String shorDescription, String longDescription) {
		super();
		this.id = id;
		this.litle = litle;
		this.year = year;
		this.genre = genre;
		this.platform = platform;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shorDescription = shorDescription;
		this.longDescription = longDescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLitle() {
		return litle;
	}

	public void setLitle(String litle) {
		this.litle = litle;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShorDescription() {
		return shorDescription;
	}

	public void setShorDescription(String shorDescription) {
		this.shorDescription = shorDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
