package defpackage;

import android.text.Editable;
import android.text.method.TextKeyListener;
import android.view.KeyEvent;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class uzb extends TextKeyListener {
    public final /* synthetic */ vzb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzb(vzb vzbVar) {
        super(TextKeyListener.Capitalize.NONE, false);
        this.a = vzbVar;
    }

    @Override // android.text.method.MetaKeyKeyListener, android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
    }

    @Override // android.text.method.TextKeyListener, android.text.method.BaseKeyListener, android.text.method.MetaKeyKeyListener, android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        vzb vzbVar = this.a;
        LinkedHashMap linkedHashMap = vzbVar.n;
        if (i != 67 || vzbVar.getEditText().getText().length() != 0 || linkedHashMap.isEmpty()) {
            return super.onKeyDown(view, editable, i, keyEvent);
        }
        Map.Entry entry = (Map.Entry) ww3.A1(linkedHashMap.entrySet());
        if (!((cq3) entry.getValue()).isChecked()) {
            ((cq3) entry.getValue()).setChecked(true);
            return true;
        }
        tzb callback = vzbVar.getCallback();
        if (callback != null) {
            ((fik) callback).v(((Number) entry.getKey()).longValue());
        }
        vzbVar.c(((Number) entry.getKey()).longValue());
        return true;
    }

    @Override // android.text.method.TextKeyListener, android.text.method.BaseKeyListener, android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.text.method.TextKeyListener, android.text.method.MetaKeyKeyListener, android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return true;
    }
}
