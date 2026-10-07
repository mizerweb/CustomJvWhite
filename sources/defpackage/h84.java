package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class h84 extends TouchDelegate {
    public final ArrayList a;

    public h84(tha thaVar) {
        super(new Rect(), thaVar);
        this.a = new ArrayList();
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList = this.a;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((TouchDelegate) it.next()).onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
