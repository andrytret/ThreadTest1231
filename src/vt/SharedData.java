package vt;

public class SharedData {

	private String mSharedText = "Initial Text";
	private boolean mAccessEnabled = true;
	private boolean mChanged = true;

	public void setSharedText(String pSharedText) {
		this.mSharedText = pSharedText;
	}

	public String getSharedText() {
		return mSharedText;
	}

	public void setAccessEnabled(boolean pAccessEnabled) {
		this.mAccessEnabled = pAccessEnabled;
	}

	public boolean isAccessEnabled() {
		return mAccessEnabled;
	}

	public void setChanged(boolean pChanged) {
		this.mChanged = pChanged;
	}

	public boolean isChanged() {
		return mChanged;
	}

}
