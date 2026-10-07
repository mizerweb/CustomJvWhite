package defpackage;

import android.widget.FrameLayout;
import one.me.stickerssearch.StickersSearchScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ong implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersSearchScreen b;

    public /* synthetic */ ong(StickersSearchScreen stickersSearchScreen, int i) {
        this.a = i;
        this.b = stickersSearchScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        StickersSearchScreen stickersSearchScreen = this.b;
        switch (i) {
            case 0:
                wng wngVar = (wng) stickersSearchScreen.b.getAccessor().c(364);
                vv vvVar = stickersSearchScreen.a;
                zv8 zv8Var = StickersSearchScreen.l[0];
                long jLongValue = ((Number) vvVar.a(stickersSearchScreen)).longValue();
                wngVar.getClass();
                return new vng(jLongValue, wngVar.a, wngVar.b, wngVar.c, wngVar.d, wngVar.e);
            case 1:
                zv8[] zv8VarArr = StickersSearchScreen.l;
                r6c r6cVar = new r6c(stickersSearchScreen.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                r6cVar.setLayoutParams(layoutParams);
                r6cVar.setAppearance(j6c.a);
                r6cVar.setSize(l6c.a);
                return r6cVar;
            default:
                zv8[] zv8VarArr2 = StickersSearchScreen.l;
                r1c r1cVar = new r1c(stickersSearchScreen.getContext());
                r1cVar.setIcon(R.drawable.icon_search);
                r1cVar.setTitle(new tnh(R.string.empty_view_title_empty_search));
                r1cVar.setSubtitle(new tnh(R.string.empty_view_subtitle_empty_search));
                return r1cVar;
        }
    }
}
