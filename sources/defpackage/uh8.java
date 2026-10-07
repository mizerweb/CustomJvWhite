package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import one.me.login.inputphone.InputPhoneScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class uh8 extends ClickableSpan {
    public final /* synthetic */ InputPhoneScreen a;
    public final /* synthetic */ String b;

    public uh8(InputPhoneScreen inputPhoneScreen, String str) {
        this.a = inputPhoneScreen;
        this.b = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        InputPhoneScreen inputPhoneScreen = this.a;
        zv8[] zv8VarArr = InputPhoneScreen.v;
        Uri uri = Uri.parse(this.b);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        try {
            inputPhoneScreen.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            gm0.Y(inputPhoneScreen.b, "open web link with terms is failed, no activity found");
            h8c h8cVar = new h8c(inputPhoneScreen);
            h8cVar.n(inputPhoneScreen.getContext().getString(R.string.no_app_found));
            h8cVar.p();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
