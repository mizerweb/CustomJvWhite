package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes3.dex */
public final class h5h extends CharacterStyle implements gn9, UpdateAppearance {
    public final /* synthetic */ int a;
    public final int b;

    public h5h(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = 4;
                break;
            default:
                this.b = 7;
                break;
        }
    }

    @Override // defpackage.ft4
    public final ft4 copy() {
        switch (this.a) {
            case 0:
                return new h5h(0);
            default:
                return new h5h(1);
        }
    }

    @Override // defpackage.gn9
    public final int getType() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setStrikeThruText(true);
                break;
            default:
                textPaint.setUnderlineText(true);
                break;
        }
    }
}
