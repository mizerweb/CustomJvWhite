package defpackage;

import android.widget.FrameLayout;
import one.me.stickerspreview.StickerPreviewScreen;
import org.apache.http.HttpStatus;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vlg implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerPreviewScreen b;

    public /* synthetic */ vlg(StickerPreviewScreen stickerPreviewScreen, int i) {
        this.a = i;
        this.b = stickerPreviewScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        StickerPreviewScreen stickerPreviewScreen = this.b;
        switch (i) {
            case 0:
                bmg bmgVar = (bmg) stickerPreviewScreen.g.getAccessor().c(HttpStatus.SC_BAD_REQUEST);
                long jO1 = stickerPreviewScreen.o1();
                vv vvVar = stickerPreviewScreen.b;
                zv8 zv8Var = StickerPreviewScreen.v[2];
                t73 t73VarB = sol.b((t3f) vvVar.a(stickerPreviewScreen));
                bmgVar.getClass();
                return new amg(jO1, t73VarB, bmgVar.a, bmgVar.b, bmgVar.c, bmgVar.d, bmgVar.e, bmgVar.f, bmgVar.g, bmgVar.h, bmgVar.i, bmgVar.j, bmgVar.k, bmgVar.l, bmgVar.m, bmgVar.n);
            case 1:
                zv8[] zv8VarArr = StickerPreviewScreen.v;
                hlg hlgVar = new hlg(stickerPreviewScreen.getContext());
                hlgVar.setId(R.id.oneme_stickers_preview_static_cell);
                int iK = gm0.K(160.0f * yl5.d().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, iK);
                layoutParams.gravity = 17;
                hlgVar.setLayoutParams(layoutParams);
                return hlgVar;
            case 2:
                zv8[] zv8VarArr2 = StickerPreviewScreen.v;
                fj9 fj9Var = new fj9(stickerPreviewScreen.getContext());
                fj9Var.setId(R.id.oneme_stickers_preview_lottie_cell);
                int iK2 = gm0.K(160.0f * yl5.d().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iK2, iK2);
                layoutParams2.gravity = 17;
                fj9Var.setLayoutParams(layoutParams2);
                return fj9Var;
            default:
                zv8[] zv8VarArr3 = StickerPreviewScreen.v;
                ouj oujVar = new ouj(stickerPreviewScreen.getContext());
                oujVar.setId(R.id.oneme_stickers_preview_webm_cell);
                int iK3 = gm0.K(160.0f * yl5.d().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iK3, iK3);
                layoutParams3.gravity = 17;
                oujVar.setLayoutParams(layoutParams3);
                return oujVar;
        }
    }
}
