package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public abstract class cnh {
    public final Context a;
    public final ky8 b;
    public final su2 c;
    public final gu4 d;
    public final ny8 e;
    public final wme f;
    public final TextUtils.TruncateAt g = TextUtils.TruncateAt.END;
    public final String h = getClass().getName();
    public final ifh i;
    public final ifh j;

    public cnh(Context context, ky8 ky8Var, su2 su2Var, gu4 gu4Var, pa4 pa4Var, ny8 ny8Var) {
        this.a = context;
        this.b = ky8Var;
        this.c = su2Var;
        this.d = gu4Var;
        this.e = ny8Var;
        final int i = 0;
        this.f = new wme(new af7(this) { // from class: xmh
            public final /* synthetic */ cnh b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                cnh cnhVar = this.b;
                switch (i2) {
                    case 0:
                        k4f k4fVarO = f55.o(cnhVar.a);
                        int i3 = k4fVarO.e + k4fVarO.f;
                        return new Size(k4fVarO.c - (k4fVarO.g + k4fVarO.h), k4fVarO.d - i3);
                    case 1:
                        LruCache lruCache = new LruCache(100);
                        String str = cnhVar.h;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "TextLayoutManager cache initialized with size=100", null);
                            }
                        }
                        return lruCache;
                    default:
                        return new bnh(cnhVar);
                }
            }
        });
        final int i2 = 1;
        this.i = new ifh(new af7(this) { // from class: xmh
            public final /* synthetic */ cnh b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                cnh cnhVar = this.b;
                switch (i3) {
                    case 0:
                        k4f k4fVarO = f55.o(cnhVar.a);
                        int i4 = k4fVarO.e + k4fVarO.f;
                        return new Size(k4fVarO.c - (k4fVarO.g + k4fVarO.h), k4fVarO.d - i4);
                    case 1:
                        LruCache lruCache = new LruCache(100);
                        String str = cnhVar.h;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "TextLayoutManager cache initialized with size=100", null);
                            }
                        }
                        return lruCache;
                    default:
                        return new bnh(cnhVar);
                }
            }
        });
        final int i3 = 2;
        this.j = new ifh(new af7(this) { // from class: xmh
            public final /* synthetic */ cnh b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                cnh cnhVar = this.b;
                switch (i4) {
                    case 0:
                        k4f k4fVarO = f55.o(cnhVar.a);
                        int i5 = k4fVarO.e + k4fVarO.f;
                        return new Size(k4fVarO.c - (k4fVarO.g + k4fVarO.h), k4fVarO.d - i5);
                    case 1:
                        LruCache lruCache = new LruCache(100);
                        String str = cnhVar.h;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "TextLayoutManager cache initialized with size=100", null);
                            }
                        }
                        return lruCache;
                    default:
                        return new bnh(cnhVar);
                }
            }
        });
        pa4Var.a(pa4.d | pa4.e, new qz(4, this));
        e9i.j0(new fz6((r8e) pq3.j.e(context).h, new wyj(this, null, 16), 3), gu4Var);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00cb  */
    public static dnh a(final cnh cnhVar, final CharSequence charSequence, ru2 ru2Var) {
        final cnh cnhVar2;
        ifh ifhVar;
        dnh dnhVar;
        final noh nohVar = cnhVar.c.b;
        bx5 bx5Var = (bx5) ((cx5) cnhVar.e.getValue()).getValue();
        final TextPaint textPaint = (TextPaint) ((bnh) cnhVar.j.getValue()).get(new anh(nohVar, pq3.j.e(cnhVar.c.a).m().getText().d, bx5Var));
        float fD = vl5.d(nohVar.j(bx5Var), cnhVar.a.getResources().getDisplayMetrics());
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        final float f = fD - (fontMetrics.descent - fontMetrics.ascent);
        Size size = (Size) cnhVar.f.getValue();
        boolean z = cnhVar.a.getResources().getConfiguration().orientation == 2;
        int width = !z ? size.getWidth() : size.getHeight();
        int width2 = z ? size.getWidth() : size.getHeight();
        int iA = cnhVar.c.a(width, ru2Var);
        int iA2 = cnhVar.c.a(width2, ru2Var);
        int i = iA < 32 ? 32 : iA;
        int i2 = iA2 >= 32 ? iA2 : 32;
        if (iA < gm0.K(yl5.d().getDisplayMetrics().density * 32.0f) || iA2 < gm0.K(yl5.d().getDisplayMetrics().density * 32.0f)) {
            String str = cnhVar.h;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    int length = charSequence.length();
                    StringBuilder sbP = qv1.p("Invalid maxWidth detected: portraitMaxWidth=", iA, ", landscapeMaxWidth=", iA2, ", portraitScreenWidth=");
                    qt4.x(width, width2, ", landscapeScreenWidth=", ", textLength=", sbP);
                    sbP.append(length);
                    a4cVar.c(je9Var, str, sbP.toString(), null);
                }
            }
        }
        zmh zmhVar = new zmh(charSequence.hashCode(), ru2Var.hashCode(), i);
        if (cnhVar.c() && (dnhVar = (dnh) cnhVar.b().get(zmhVar)) != null) {
            return dnhVar;
        }
        boolean z2 = i == i2;
        final int i3 = 0;
        final int i4 = i;
        ifh ifhVar2 = new ifh(new af7(cnhVar, nohVar, charSequence, textPaint, i4, f, i3) { // from class: ymh
            public final /* synthetic */ int a;
            public final /* synthetic */ cnh b;
            public final /* synthetic */ CharSequence c;
            public final /* synthetic */ TextPaint d;
            public final /* synthetic */ int e;
            public final /* synthetic */ float f;

            {
                this.a = i3;
                this.b = cnhVar;
                this.c = charSequence;
                this.d = textPaint;
                this.e = i4;
                this.f = f;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = this.a;
                cnh cnhVar3 = this.b;
                switch (i5) {
                    case 0:
                        ky8 ky8Var = cnhVar3.b;
                        TextUtils.TruncateAt truncateAt = cnhVar3.g;
                        return ky8.a(ky8Var, this.c, this.d, this.e, cnhVar3.e(), false, truncateAt, this.f, cnhVar3.d(), 16);
                    default:
                        ky8 ky8Var2 = cnhVar3.b;
                        TextUtils.TruncateAt truncateAt2 = cnhVar3.g;
                        return ky8.a(ky8Var2, this.c, this.d, this.e, cnhVar3.e(), false, truncateAt2, this.f, cnhVar3.d(), 16);
                }
            }
        });
        if (z2) {
            cnhVar2 = cnhVar;
            ifhVar = ifhVar2;
        } else {
            final int i5 = 1;
            cnhVar2 = cnhVar;
            final int i6 = i2;
            ifhVar = new ifh(new af7(cnhVar2, nohVar, charSequence, textPaint, i6, f, i5) { // from class: ymh
                public final /* synthetic */ int a;
                public final /* synthetic */ cnh b;
                public final /* synthetic */ CharSequence c;
                public final /* synthetic */ TextPaint d;
                public final /* synthetic */ int e;
                public final /* synthetic */ float f;

                {
                    this.a = i5;
                    this.b = cnhVar2;
                    this.c = charSequence;
                    this.d = textPaint;
                    this.e = i6;
                    this.f = f;
                }

                @Override // defpackage.af7
                public final Object invoke() {
                    int i7 = this.a;
                    cnh cnhVar3 = this.b;
                    switch (i7) {
                        case 0:
                            ky8 ky8Var = cnhVar3.b;
                            TextUtils.TruncateAt truncateAt = cnhVar3.g;
                            return ky8.a(ky8Var, this.c, this.d, this.e, cnhVar3.e(), false, truncateAt, this.f, cnhVar3.d(), 16);
                        default:
                            ky8 ky8Var2 = cnhVar3.b;
                            TextUtils.TruncateAt truncateAt2 = cnhVar3.g;
                            return ky8.a(ky8Var2, this.c, this.d, this.e, cnhVar3.e(), false, truncateAt2, this.f, cnhVar3.d(), 16);
                    }
                }
            });
        }
        boolean z3 = cnhVar2.a.getResources().getConfiguration().orientation == 1;
        mnh mnhVar = new mnh(ifhVar2, bx5Var);
        mnh mnhVar2 = z2 ? mnhVar : new mnh(ifhVar, bx5Var);
        if (z2 || z3) {
            mnhVar.b((Layout) ifhVar2.getValue());
            if (mnhVar != mnhVar2) {
                yab.i0(cnhVar2.d, null, 0, new y73(mnhVar2, ifhVar, null, 19), 3);
            }
        } else {
            mnhVar2.b((Layout) ifhVar.getValue());
            yab.i0(cnhVar2.d, null, 0, new j8g(mnhVar, ifhVar2, (lq4) null, 14), 3);
        }
        dnh dnhVar2 = new dnh(mnhVar, mnhVar2);
        if (cnhVar2.c()) {
            cnhVar2.b().put(zmhVar, dnhVar2);
        }
        return dnhVar2;
    }

    public final LruCache b() {
        return (LruCache) this.i.getValue();
    }

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();
}
