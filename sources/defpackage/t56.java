package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
public final class t56 implements TextWatcher {
    public final EditText a;
    public s56 b;
    public boolean c = true;

    public t56(EditText editText) {
        this.a = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l46 l46VarA = l46.a();
            if (editableText == null) {
                length = 0;
            } else {
                l46VarA.getClass();
                length = editableText.length();
            }
            l46VarA.e(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.a;
        if (editText.isInEditMode() || !this.c || l46.k == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = l46.a().b();
        if (iB != 0) {
            if (iB == 1) {
                l46.a().e(i, i3 + i, (Spannable) charSequence);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        l46 l46VarA = l46.a();
        if (this.b == null) {
            this.b = new s56(editText);
        }
        l46VarA.f(this.b);
    }
}
