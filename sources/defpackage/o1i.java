package defpackage;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class o1i extends View implements eph {
    public Layout a;
    public boolean b;
    public boolean c;

    public o1i(Context context) {
        super(context);
        setId(R.id.messages_list_transcription_text);
        this.b = true;
    }

    public final CharSequence getLayout() {
        Layout layout = this.a;
        if (layout != null) {
            return layout.getText();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012e, code lost:
    
        r18.restoreToCount(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0131, code lost:
    
        throw r0;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o1i.onDraw(android.graphics.Canvas):void");
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        invalidate();
    }

    public final void setIncomingMessage(boolean z) {
        this.c = z;
    }

    public final void setState(i1i i1iVar) {
        if (i1iVar == null) {
            return;
        }
        this.a = i1iVar.a;
        this.b = i1iVar.b;
        pq3.j.h(this);
        invalidate();
        requestLayout();
        invalidate();
    }
}
