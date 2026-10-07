package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u21 {
    public boolean canRepeat() {
        return true;
    }

    public mp intoParam(String str) {
        return intoParam(new i5h(str));
    }

    public boolean isSupplied() {
        return false;
    }

    public boolean shouldPost() {
        return false;
    }

    public boolean shouldSkipParam() {
        return false;
    }

    public abstract void write(mv8 mv8Var);

    public final mp intoParam(s21 s21Var) {
        return new t21(s21Var, this);
    }
}
