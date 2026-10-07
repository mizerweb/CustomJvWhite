package defpackage;

import android.widget.FrameLayout;
import one.me.stickersshowcase.StickersShowcaseScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uog implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersShowcaseScreen b;

    public /* synthetic */ uog(StickersShowcaseScreen stickersShowcaseScreen, int i) {
        this.a = i;
        this.b = stickersShowcaseScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        StickersShowcaseScreen stickersShowcaseScreen = this.b;
        switch (i) {
            case 0:
                wtc wtcVar = stickersShowcaseScreen.b;
                apg apgVar = (apg) wtcVar.getAccessor().c(381);
                vv vvVar = stickersShowcaseScreen.a;
                zv8 zv8Var = StickersShowcaseScreen.m[0];
                return new zog(((Number) vvVar.a(stickersShowcaseScreen)).longValue(), (hog) wtcVar.getAccessor().c(380), apgVar.a, apgVar.b, apgVar.c, apgVar.d, apgVar.e, apgVar.f, apgVar.g);
            case 1:
                zv8[] zv8VarArr = StickersShowcaseScreen.m;
                r6c r6cVar = new r6c(stickersShowcaseScreen.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                r6cVar.setLayoutParams(layoutParams);
                r6cVar.setAppearance(j6c.a);
                r6cVar.setSize(m6c.a);
                return r6cVar;
            default:
                zv8[] zv8VarArr2 = StickersShowcaseScreen.m;
                r1c r1cVar = new r1c(stickersShowcaseScreen.getContext());
                r1cVar.setIcon(R.drawable.icon_search);
                r1cVar.setTitle(new tnh(R.string.empty_view_title_empty_search));
                r1cVar.setSubtitle(new tnh(R.string.empty_view_subtitle_empty_search));
                return r1cVar;
        }
    }
}
