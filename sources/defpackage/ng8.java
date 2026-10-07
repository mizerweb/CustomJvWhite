package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ng8 extends FrameLayout implements l61 {
    public static final /* synthetic */ int h = 0;
    public float a;
    public float b;
    public long c;
    public kg8 d;
    public final o61 e;
    public mg8 f;
    public final w45 g;

    public ng8(Context context) {
        super(context, null);
        this.a = yl5.d().getDisplayMetrics().density * 16.0f;
        this.b = yl5.d().getDisplayMetrics().density * 6.0f;
        o61 o61Var = new o61(getContext());
        this.e = o61Var;
        this.g = new w45(300L);
        o61Var.setClickListener(this);
        o61Var.setId(R.id.messages_list_item_keyboard_buttons);
        addView(o61Var, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x002a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0189  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v2 */
    public final void a(long j, kg8 kg8Var, boolean z) {
        boolean z2;
        float f;
        float f2;
        int i;
        ?? r0;
        float[] fArr;
        float[] fArr2;
        boolean zA;
        ArrayList arrayList = kg8Var.a;
        this.c = j;
        this.d = kg8Var;
        float f3 = this.a;
        float f4 = this.b;
        boolean zE = p90.E(this);
        o61 o61Var = this.e;
        kw8 kw8Var = o61Var.i;
        n61 n61Var = new n61(1, o61Var, o61.class, "bindLoading", "bindLoading(Lru/ok/tamtam/models/bots/Keyboard;)V", 0, 0);
        if (kw8Var != null) {
            ArrayList arrayList2 = ((kg8) kw8Var).a;
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i2 = 0;
                z2 = false;
                while (true) {
                    if (i2 >= size) {
                        f = f3;
                        f2 = f4;
                        i = 0;
                        break;
                    }
                    h61 h61Var = (h61) arrayList.get(i2);
                    i = 0;
                    if (h61Var.size() != ((h61) arrayList2.get(i2)).size()) {
                        z2 = false;
                        f = f3;
                        f2 = f4;
                        break;
                    }
                    int size2 = h61Var.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        c61 c61Var = (c61) h61Var.get(i3);
                        ArrayList arrayList3 = arrayList2;
                        c61 c61Var2 = (c61) ((h61) arrayList2.get(i2)).get(i3);
                        float f5 = f3;
                        float f6 = f4;
                        if (c61Var.h != c61Var2.h && c61Var.equals(c61Var2)) {
                            n61Var.invoke(kg8Var);
                            z2 = true;
                        }
                        i3++;
                        arrayList2 = arrayList3;
                        f3 = f5;
                        f4 = f6;
                    }
                    i2++;
                }
            } else {
                f = f3;
                f2 = f4;
                i = 0;
                z2 = false;
            }
        } else {
            f = f3;
            f2 = f4;
            i = 0;
            z2 = false;
        }
        if (z2) {
            return;
        }
        kw8 kw8Var2 = o61Var.i;
        if (kw8Var2 != null) {
            zA = ((kg8) kw8Var2).a(kg8Var);
        } else {
            r0 = i;
        }
        if (r0 != 0) {
            r0 = zA;
            o61Var.invalidate();
            return;
        }
        o61Var.E = zE;
        o61Var.i = kg8Var;
        o61Var.F = z;
        if (z) {
            r0 = zA;
            o61Var.j.setColor(pq3.j.h(o61Var).b().c);
        }
        r0 = zA;
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList.size();
        int i4 = i;
        while (i4 < size3) {
            h61 h61Var2 = (h61) arrayList.get(i4);
            int size4 = h61Var2.size();
            ?? r22 = h61Var2.size() == 1 ? 1 : i;
            ?? r23 = i4 == 0 ? 1 : i;
            int size5 = h61Var2.size();
            int i5 = size4;
            int i6 = i;
            while (i6 < size5) {
                c61 c61Var3 = (c61) h61Var2.get(i6);
                ?? r24 = i6 == 0 ? 1 : i;
                ?? r25 = i6 == h61Var2.size() - 1 ? 1 : i;
                int i7 = i4 == arrayList.size() - 1 ? 1 : i;
                if (f == -1.0f && f2 == -1.0f) {
                    fArr = null;
                } else {
                    float[] fArr3 = new float[4];
                    fArr3[i] = f2;
                    fArr3[1] = f2;
                    fArr3[2] = f2;
                    fArr3[3] = f2;
                    if (i7 == 0) {
                        fArr = fArr3;
                    } else {
                        if (r24 != 0 && r25 != 0) {
                            fArr2 = new float[4];
                            fArr2[i] = f2;
                            fArr2[1] = f2;
                            fArr2[2] = f;
                            fArr2[3] = f;
                        } else if (r24 != 0) {
                            fArr2 = new float[4];
                            fArr2[i] = f2;
                            fArr2[1] = f2;
                            fArr2[2] = f2;
                            fArr2[3] = f;
                        } else if (r25 != 0) {
                            fArr2 = new float[4];
                            fArr2[i] = f2;
                            fArr2[1] = f2;
                            fArr2[2] = f;
                            fArr2[3] = f2;
                        } else {
                            fArr = fArr3;
                        }
                        fArr = fArr2;
                    }
                }
                arrayList4.add(new s01(c61Var3, new r60(), i5, r22, r23, r24, r25, fArr));
                i6++;
                i5 = -1;
            }
            i4++;
        }
        o61Var.h = arrayList4;
        if (o61Var.z == null) {
            xc8 xc8Var = new xc8(o61Var.getContext());
            xc8Var.setCallback(o61Var);
            o61Var.z = xc8Var;
        }
        o61Var.requestLayout();
    }

    public final void setClickListener(mg8 mg8Var) {
        this.f = mg8Var;
    }
}
