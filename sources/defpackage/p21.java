package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public final class p21 {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public p21(TextPaint textPaint) {
        this.c = textPaint;
        this.a = 1;
        this.b = 1;
        this.d = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public rj8 a() {
        return new rj8((IntentSender) this.c, (Intent) this.d, this.a, this.b);
    }

    public bdd b() {
        return new bdd((TextPaint) this.c, (TextDirectionHeuristic) this.d, this.a, this.b);
    }

    public b2i c() {
        int i = this.a;
        return new b2i((String) this.c, i, this.b, (String) this.d);
    }

    public void d(String str) {
        String strN = uya.n(str);
        lvb.S(strN == null || uya.i(strN), "Not an audio MIME type: %s", strN);
        this.c = strN;
    }

    public void e(int i) {
        this.a = i;
    }

    public void f(Intent intent) {
        this.d = intent;
    }

    public void g(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public void h(int i) {
        this.b = i;
    }

    public void i(TextDirectionHeuristic textDirectionHeuristic) {
        this.d = textDirectionHeuristic;
    }

    public void j(String str) {
        String strN = uya.n(str);
        lvb.S(strN == null || uya.m(strN), "Not a video MIME type: %s", strN);
        this.d = strN;
    }

    public p21(IntentSender intentSender) {
        this.c = intentSender;
    }
}
