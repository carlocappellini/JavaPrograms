package com.carlocappellini;

public class Button {
    private String title;
    private OnclickListener onClickListener;

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnclickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(this.title);
    }



    public Button(String title) {
        this.title = title;
    }

    public interface OnclickListener {
        public void onClick(String title);

    }
}
