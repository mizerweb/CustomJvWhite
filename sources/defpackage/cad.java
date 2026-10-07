package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class cad extends w7d {
    public final rea u;
    public final b9b v;

    public cad(Context context, rea reaVar) {
        ei5 ei5Var = new ei5(context);
        super(ei5Var);
        this.u = reaVar;
        long[] jArr = q1f.a;
        this.v = new b9b();
        ei5Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ei5Var.setMinLines(1);
        ei5Var.setShowLengthLimitWhileFocused(true);
        ei5Var.setLimitErrorTextColorAttr(Integer.valueOf(R.attr.text_negative));
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        n7d n7dVar = (n7d) k79Var;
        ei5 ei5Var = (ei5) this.a;
        ei5Var.setMaxCount(200);
        CharSequence charSequenceB = n7dVar.a.b(ei5Var.getContext());
        ei5Var.setText(charSequenceB != null ? charSequenceB.toString() : null);
        ei5Var.setHint(n7dVar.b);
        bad badVar = new bad(this, 0, n7dVar);
        p1c p1cVar = ei5Var.j;
        rt1 rt1Var = new rt1(badVar, 1, ei5Var);
        p1cVar.addTextChangedListener(rt1Var);
        bi5 bi5Var = new bi5(ei5Var, rt1Var);
        b9b b9bVar = this.v;
        bi5 bi5Var2 = (bi5) b9bVar.d("after_text_changed_releasable_id");
        if (bi5Var2 != null) {
            bi5Var2.a();
        }
        b9bVar.k("after_text_changed_releasable_id", bi5Var);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004a A[LOOP:0: B:5:0x000f->B:15:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x004d A[EDGE_INSN: B:19:0x004d->B:16:0x004d BREAK  A[LOOP:0: B:5:0x000f->B:15:0x004a], SYNTHETIC] */
    @Override // defpackage.s7g
    public final void G() {
        b9b b9bVar = this.v;
        Object[] objArr = b9bVar.b;
        Object[] objArr2 = b9bVar.c;
        long[] jArr = b9bVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            ((bi5) objArr2[i4]).a();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        b9bVar.g();
    }
}
