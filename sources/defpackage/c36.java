package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c36 implements f36 {
    public final g36 a;
    public qvc b;
    public h36 c;
    public final boolean k;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f = -65536;
    public float g = 24.0f;
    public boolean h = true;
    public boolean i = false;
    public boolean j = true;
    public boolean l = true;
    public final boolean m = true;

    public c36(g36 g36Var, boolean z) {
        this.k = false;
        this.a = g36Var;
        g36Var.setListener(this);
        this.k = z;
    }

    public final void a() {
        h36 h36Var = this.c;
        if (h36Var != null) {
            hb hbVarF = h36Var.f();
            g36 g36Var = this.a;
            x26 x26Var = g36Var.getLayers().get(g36Var.getLayers().size() - 1);
            if (x26Var instanceof ju5) {
                ju5 ju5Var = (ju5) x26Var;
                RectF rectF = new RectF();
                ju5Var.b.computeBounds(rectF, true);
                float f = -(ju5Var.c.getStrokeWidth() / 2.0f);
                rectF.inset(f, f);
                Rect rect = new Rect();
                rectF.roundOut(rect);
                if (!Rect.intersects(rect, g36Var.getBounds())) {
                    g36Var.a.remove(x26Var);
                    g36Var.invalidate();
                    this.c = null;
                    return;
                }
            }
            this.e.clear();
            this.d.add(hbVarF);
            this.i = true;
        }
        this.c = null;
        this.h = true;
        c();
    }

    public final y26 b() {
        Integer num;
        g36 g36Var = this.a;
        List<x26> layers = g36Var.getLayers();
        Rect bounds = g36Var.getBounds();
        boolean z = g36Var.p;
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        Iterator<x26> it = layers.iterator();
        int i = 1;
        while (true) {
            jy8 jy8Var = null;
            if (!it.hasNext()) {
                break;
            }
            x26 next = it.next();
            if (next instanceof ju5) {
                ju5 ju5Var = (ju5) next;
                Paint paint = ju5Var.c;
                jy8Var = new jy8(i, 1, paint.getColor(), paint.getStrokeWidth(), new ArrayList(ju5Var.a));
            }
            if (jy8Var != null) {
                arrayList.add(jy8Var);
                map.put(next, Integer.valueOf(i));
                i++;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (hb hbVar : this.d) {
            cy3 cy3Var = (!(hbVar instanceof hb) || (num = (Integer) map.get(hbVar.a)) == null) ? null : new cy3(num.intValue());
            if (cy3Var != null) {
                arrayList2.add(cy3Var);
            }
        }
        return new y26(arrayList, arrayList2, new Rect(bounds), z);
    }

    public final void c() {
        qvc qvcVar = this.b;
        if (qvcVar != null) {
            boolean z = !this.e.isEmpty();
            ArrayList arrayList = this.d;
            boolean z2 = !arrayList.isEmpty();
            boolean z3 = !arrayList.isEmpty();
            boolean z4 = this.h;
            boolean z5 = this.l;
            tvc tvcVar = qvcVar.e;
            tvcVar.getClass();
            tvc tvcVar2 = new tvc(z, z2, z3, tvcVar.d, tvcVar.e, z4, tvcVar.g, z5);
            qvcVar.e = tvcVar2;
            qvcVar.a.p1(tvcVar2);
        }
    }

    public final void d(MotionEvent motionEvent) {
        h36 h36Var;
        if (this.m) {
            int action = motionEvent.getAction();
            boolean z = this.k;
            g36 g36Var = this.a;
            if (action == 0) {
                if (z) {
                    this.l = false;
                }
                motionEvent.getX();
                motionEvent.getY();
                List<x26> layers = g36Var.getLayers();
                for (int size = layers.size() - 1; size >= 0; size--) {
                    layers.get(size);
                }
                ju5 ju5Var = new ju5(this.f, this.g);
                if (this.j) {
                    ih ihVar = new ih();
                    ihVar.b = new ArrayList();
                    ihVar.a = ju5Var;
                    this.c = ihVar;
                } else {
                    this.c = new vw(ju5Var);
                }
                this.c.i(motionEvent);
                g36Var.a.add(ju5Var);
                g36Var.invalidate();
                ju5Var.f = new jj2(29, g36Var);
                c();
            } else if (motionEvent.getAction() == 1) {
                if (z) {
                    this.l = true;
                }
                h36 h36Var2 = this.c;
                if (h36Var2 != null) {
                    h36Var2.l(motionEvent);
                }
                a();
            } else if (motionEvent.getAction() == 3) {
                if (z) {
                    this.l = true;
                }
                a();
            } else if (motionEvent.getAction() == 2 && (h36Var = this.c) != null) {
                h36Var.l(motionEvent);
            }
            g36Var.invalidate();
        }
    }
}
