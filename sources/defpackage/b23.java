package defpackage;

import android.net.Uri;
import java.io.IOException;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import org.json.JSONException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class b23 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ChatMediaDownloadBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b23(lq4 lq4Var, ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = chatMediaDownloadBottomSheet;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = this.g;
        switch (i) {
            case 0:
                b23 b23Var = new b23(lq4Var, chatMediaDownloadBottomSheet, 0);
                b23Var.f = obj;
                return b23Var;
            default:
                b23 b23Var2 = new b23(lq4Var, chatMediaDownloadBottomSheet, 1);
                b23Var2.f = obj;
                return b23Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws JSONException, IOException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((b23) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((b23) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws JSONException, IOException {
        og5 og5Var;
        int i = this.e;
        sbi sbiVar = sbi.a;
        ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                jq5 jq5Var = (jq5) obj2;
                if (!(jq5Var instanceof iq5)) {
                    if (!(jq5Var instanceof hq5)) {
                        ore.o();
                        return null;
                    }
                    int i2 = ((hq5) jq5Var).a;
                    zv8[] zv8VarArr = ChatMediaDownloadBottomSheet.B;
                    chatMediaDownloadBottomSheet.F1(i2, R.drawable.icon_warning);
                    chatMediaDownloadBottomSheet.v1(true);
                    og5Var = chatMediaDownloadBottomSheet.y;
                    if (og5Var != null) {
                        return sbiVar;
                    }
                    og5Var.a();
                    return sbiVar;
                }
                chatMediaDownloadBottomSheet.v1(false);
                iq5 iq5Var = (iq5) jq5Var;
                Uri uri = iq5Var.a;
                dq5 dq5Var = iq5Var.b;
                switch (dq5Var.ordinal()) {
                    case 0:
                        if (uri != null) {
                            dp4.c(uri);
                            String str = sj8.a;
                            sj8.i(chatMediaDownloadBottomSheet.getContext(), uri, "video/*");
                        }
                        og5Var = chatMediaDownloadBottomSheet.y;
                        if (og5Var != null) {
                            return sbiVar;
                        }
                        og5Var.a();
                        return sbiVar;
                    case 1:
                        chatMediaDownloadBottomSheet.F1(R.string.media_share_dialog_download_video_success, R.drawable.icon_check);
                        og5Var = chatMediaDownloadBottomSheet.y;
                        if (og5Var != null) {
                            return sbiVar;
                        }
                        og5Var.a();
                        return sbiVar;
                    case 2:
                    case 4:
                        if (uri != null) {
                            dp4.c(uri);
                            String str2 = sj8.a;
                            sj8.i(chatMediaDownloadBottomSheet.getContext(), uri, "image/*");
                        }
                        og5Var = chatMediaDownloadBottomSheet.y;
                        if (og5Var != null) {
                            return sbiVar;
                        }
                        og5Var.a();
                        return sbiVar;
                    case 3:
                    case 5:
                        chatMediaDownloadBottomSheet.F1(dq5Var == dq5.e ? R.string.media_share_dialog_download_gif_success : R.string.media_share_dialog_download_photo_success, R.drawable.icon_check_round_fill);
                        og5Var = chatMediaDownloadBottomSheet.y;
                        if (og5Var != null) {
                            return sbiVar;
                        }
                        og5Var.a();
                        return sbiVar;
                    case 6:
                        if (uri != null) {
                            dp4.c(uri);
                            String str3 = sj8.a;
                            sj8.i(chatMediaDownloadBottomSheet.getContext(), uri, "*/*");
                        }
                        og5Var = chatMediaDownloadBottomSheet.y;
                        if (og5Var != null) {
                            return sbiVar;
                        }
                        og5Var.a();
                        return sbiVar;
                    default:
                        ore.o();
                        return null;
                }
            default:
                ch3.d0(obj);
                ((v50) chatMediaDownloadBottomSheet.w.getValue()).setLevel(gm0.K(((Number) obj2).floatValue() * 10000.0f));
                return sbiVar;
        }
    }
}
