package defpackage;

import ru.ok.tamtam.android.prefs.FilePrefsException;

/* JADX INFO: loaded from: classes.dex */
public final class yja implements ds6 {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ yja(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.ds6
    public void error(String str, Throwable th) {
        String str2 = this.b;
        if (th != null) {
            gm0.V(str2, str, new FilePrefsException(str, th));
        } else {
            gm0.Y(str2, str);
        }
    }

    @Override // defpackage.ds6
    public void log(String str) {
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return c0a.o("MessageText(text='", "***", "')");
            default:
                return super.toString();
        }
    }
}
