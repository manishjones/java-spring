package superman.com;

public class Element {
	private String game;
	private String skill;
	private int exp;
	private boolean adroit;
	
	public Element(){
		
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public boolean isAdroit() {
		return adroit;
	}

	public void setAdroit(boolean adroit) {
		this.adroit = adroit;
	}
	
	public boolean getAdroit(){
		return this.adroit;
	}

}
