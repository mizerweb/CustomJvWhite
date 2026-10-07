package one.me.videoeditor.trimslider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a5j;
import defpackage.c5j;
import defpackage.c9;
import defpackage.d5j;
import defpackage.e5j;
import defpackage.e9i;
import defpackage.fpi;
import defpackage.fz6;
import defpackage.ha9;
import defpackage.hzi;
import defpackage.i19;
import defpackage.j95;
import defpackage.lwi;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.r07;
import defpackage.r8e;
import defpackage.so2;
import defpackage.t5d;
import defpackage.v6a;
import defpackage.vbi;
import defpackage.wtc;
import defpackage.x6a;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zv8;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\n\u000bB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lone/me/videoeditor/trimslider/VideoTrimSliderWidget;", "Lone/me/sdk/arch/Widget;", "Lha9;", "localAccountId", "Llwi;", "bitmapTransformer", "", "minDurationMs", "<init>", "(Lha9;Llwi;J)V", "b5j", "c5j", "video-trim-slider"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoTrimSliderWidget extends Widget {
    public static final /* synthetic */ zv8[] f;
    public final lwi a;
    public final long b;
    public final wtc c;
    public final ny8 d;
    public final t5d e;

    static {
        z8b z8bVar = new z8b(VideoTrimSliderWidget.class, "sizeConfig", "getSizeConfig()Lone/me/videoeditor/trimslider/VideoTrimSliderWidget$SizeConfig;");
        zfe.a.getClass();
        f = new zv8[]{z8bVar};
    }

    public VideoTrimSliderWidget(ha9 ha9Var, lwi lwiVar, long j) {
        super(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
        this.a = lwiVar;
        this.b = j;
        this.c = new wtc(m35getAccountScopeuqN4xOY());
        this.d = createViewModelLazy(a5j.class, new hzi(2, new vbi(13, this)));
        this.e = new t5d(new c5j(v6a.a, v6a.b, v6a.c), 16, this);
    }

    public final c5j o1() {
        zv8 zv8Var = f[0];
        return (c5j) this.e.b;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new x6a(layoutInflater.getContext());
    }

    @Override // defpackage.br4
    public final void onDestroy() {
        p1().x = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        x6a x6aVar = (x6a) view;
        x6aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, o1().a));
        x6aVar.setPadding(o1().b, o1().c, o1().b, o1().c);
        x6aVar.setListener(new fpi(1, this));
        r8e r8eVar = p1().k;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new d5j(null, x6aVar, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().p, getViewLifecycleOwner().f(), n09Var), new d5j(null, x6aVar, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new r07(p1().q, p1().r, new e5j(x6aVar, null), 0), getViewLifecycleOwner().f(), n09Var), new c9(2, null, 27), 3), getViewLifecycleScope());
    }

    public final a5j p1() {
        return (a5j) this.d.getValue();
    }

    public final void q1(long j, long j2) {
        a5j a5jVarP1 = p1();
        mjg mjgVar = a5jVarP1.l;
        Long lValueOf = Long.valueOf(j);
        mjgVar.getClass();
        mjgVar.j(null, lValueOf);
        mjg mjgVar2 = a5jVarP1.m;
        Long lValueOf2 = Long.valueOf(j2);
        mjgVar2.getClass();
        mjgVar2.j(null, lValueOf2);
    }

    public final void r1(float f2, float f3) {
        a5j a5jVarP1 = p1();
        mjg mjgVar = a5jVarP1.n;
        Float fValueOf = Float.valueOf(f2);
        mjgVar.getClass();
        mjgVar.j(null, fValueOf);
        mjg mjgVar2 = a5jVarP1.o;
        Float fValueOf2 = Float.valueOf(f3);
        mjgVar2.getClass();
        mjgVar2.j(null, fValueOf2);
    }

    public final void s1(List list) {
        int i;
        int i2;
        int i3;
        a5j a5jVarP1 = p1();
        if (list.equals(a5jVarP1.s)) {
            return;
        }
        a5jVarP1.s = list;
        int i4 = a5jVarP1.t;
        if (i4 <= 0 || (i = a5jVarP1.u) <= 0 || (i2 = a5jVarP1.v) <= 0 || (i3 = a5jVarP1.w) <= 0) {
            return;
        }
        a5jVarP1.C(list, i4, i, i2, i3);
    }

    public VideoTrimSliderWidget() {
        this(null, null, 0L, 7, null);
    }

    public VideoTrimSliderWidget(ha9 ha9Var, lwi lwiVar, long j, int i, j95 j95Var) {
        this((i & 1) != 0 ? ha9.b : ha9Var, (i & 2) != 0 ? new so2(0) : lwiVar, (i & 4) != 0 ? 1000L : j);
    }
}
