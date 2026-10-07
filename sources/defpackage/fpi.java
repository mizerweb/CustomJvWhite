package defpackage;

import android.os.SystemClock;
import java.util.Map;
import one.me.videoeditor.trimslider.VideoTrimSliderWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class fpi implements w6a, rg4, sf7 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ fpi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(float f, float f2) {
        VideoTrimSliderWidget videoTrimSliderWidget = (VideoTrimSliderWidget) this.b;
        zv8[] zv8VarArr = VideoTrimSliderWidget.f;
        a5j a5jVarP1 = videoTrimSliderWidget.p1();
        mjg mjgVar = a5jVarP1.o;
        mjg mjgVar2 = a5jVarP1.n;
        float fLongValue = ((Number) a5jVarP1.l.getValue()).longValue();
        if ((fLongValue * f2) - (fLongValue * f) >= a5jVarP1.f) {
            if (((Number) mjgVar2.getValue()).floatValue() != f) {
                a5jVarP1.D(f);
            } else if (((Number) mjgVar.getValue()).floatValue() != f2) {
                a5jVarP1.D(f2);
            }
            mjgVar2.j(null, Float.valueOf(f));
            Float fValueOf = Float.valueOf(f2);
            mjgVar.getClass();
            mjgVar.j(null, fValueOf);
            b5j b5jVar = a5jVarP1.x;
            if (b5jVar != null) {
                b5jVar.y(f, f2);
            }
        }
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        p5a p5aVarC;
        yu4 yu4Var;
        Float fI;
        switch (this.a) {
            case 2:
                rh6 rh6Var = (rh6) obj;
                rh6Var.getClass();
                a4e a4eVar = rh6Var.a;
                yig yigVar = (yig) this.b;
                if (yigVar.f) {
                    o91 o91Var = (o91) yigVar.d.a;
                    skg skgVar = o91Var.d0;
                    skgVar.f(a4eVar, rh6Var.b, rh6Var.c);
                    o91Var.h(rh6Var.d, rh6Var.e.w());
                    if (o91Var.P && (p5aVarC = skgVar.c(o91Var.j0.a)) != null) {
                        pk2 pk2VarC = a4eVar.c();
                        o91Var.O.c(p5aVarC, pk2VarC != null ? pk2VarC.i.equals("tcp") : false, a4eVar.a);
                    }
                }
                ((gsh) yigVar.e).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                for (Map.Entry entry : yigVar.i.entrySet()) {
                    bkg bkgVar = (bkg) entry.getKey();
                    gkk gkkVar = (gkk) entry.getValue();
                    if ((gkkVar.b.toMillis(gkkVar.a) + gkkVar.c) - 10 < jElapsedRealtime) {
                        gkkVar.c = jElapsedRealtime;
                        bkgVar.a(a4eVar);
                    }
                }
                return;
            default:
                ((Long) obj).getClass();
                y50 y50Var = (y50) ((g85) this.b).b;
                yu4 yu4VarC = ((zu4) y50Var.f).c();
                if (yu4VarC != null && (yu4Var = (yu4) ((zu4) y50Var.f).b) != null && (fI = ((uvc) y50Var.e).i(yu4VarC, yu4Var)) != null) {
                    long jFloatValue = (long) (fI.floatValue() * 100.0f * ((Number) ((ifh) ((ljf) y50Var.d).d).getValue()).longValue() * ((Number) ((ifh) ((ljf) y50Var.d).b).getValue()).longValue());
                    synchronized (y50Var.g) {
                        y50Var.a = Math.max(y50Var.a, jFloatValue);
                    }
                    synchronized (y50Var.g) {
                        y50Var.b += jFloatValue;
                        y50Var.c++;
                    }
                }
                sti stiVar = (sti) ((g85) this.b).d;
                ((zu4) stiVar.f).c();
                yu4 yu4Var2 = (yu4) ((zu4) stiVar.f).b;
                if (yu4Var2 == null) {
                    return;
                }
                long jLongValue = ((Number) ((ifh) ((ljf) stiVar.b).c).getValue()).longValue() * yu4Var2.b.f;
                synchronized (stiVar.e) {
                    stiVar.c = Math.max(jLongValue, stiVar.c);
                }
                synchronized (stiVar.e) {
                    stiVar.d += jLongValue;
                    stiVar.g++;
                }
                return;
        }
    }

    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        Long l = (Long) obj;
        l.getClass();
        ykc ykcVar = (ykc) this.b;
        ykcVar.f.invoke("run routine #" + l);
        return new p64(2, new qyb(1, ykcVar));
    }

    public /* synthetic */ fpi() {
        this.a = 3;
    }
}
