package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nw8 extends sr {
    public final /* synthetic */ int c = 1;
    public final Object d;
    public final Object e;

    public nw8(GridLayoutManager gridLayoutManager, nee neeVar) {
        super(5);
        this.d = gridLayoutManager;
        this.e = neeVar;
    }

    @Override // defpackage.sr
    public final int P(int i) {
        GridLayoutManager gridLayoutManagerC0;
        int i2 = this.c;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i2) {
            case 0:
                b46 b46Var = ((KeyboardEmojiWidget) obj).g;
                if (i >= b46Var.l() || b46Var.n(i) != R.id.oneme_media_keyboard_view_type_category_emoji || (gridLayoutManagerC0 = tre.c0((RecyclerView) obj2)) == null) {
                    return 1;
                }
                return gridLayoutManagerC0.F;
            default:
                nee neeVar = (nee) obj2;
                if (i >= neeVar.l()) {
                    return 1;
                }
                int iN = neeVar.n(i);
                if (iN == R.id.oneme_stickers_view_type_stickers_set || iN == R.id.oneme_stickers_view_type_stickers_set_showcase || iN == R.id.oneme_media_keyboard_view_type_fake_search) {
                    return ((GridLayoutManager) obj).F;
                }
                return 1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw8(KeyboardEmojiWidget keyboardEmojiWidget, RecyclerView recyclerView) {
        super(5);
        this.d = keyboardEmojiWidget;
        this.e = recyclerView;
    }
}
