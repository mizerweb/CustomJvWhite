package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class s46 extends InputConnectionWrapper {
    public final TextView a;
    public final ldf b;

    public s46(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        ldf ldfVar = new ldf(24);
        super(inputConnection, false);
        this.a = textView;
        this.b = ldfVar;
        if (l46.k != null) {
            l46 l46VarA = l46.a();
            if (l46VarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            i46 i46Var = l46VarA.e;
            i46Var.getClass();
            Bundle bundle = editorInfo.extras;
            twa twaVar = (twa) ((ljf) i46Var.c).b;
            int iA = twaVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? twaVar.b.getInt(iA + twaVar.a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return kr6.F(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return kr6.F(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
