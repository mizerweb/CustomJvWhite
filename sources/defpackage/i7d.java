package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class i7d extends g6g implements kn8 {
    public final q7d f;
    public final uik g;
    public int h;

    public i7d(q7d q7dVar, uik uikVar, ExecutorService executorService) {
        super(executorService);
        this.f = q7dVar;
        this.g = uikVar;
    }

    @Override // defpackage.y69
    public final void G(List list, List list2) {
        List list3 = list2;
        int i = 0;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((o7d) it.next()).getF() == R.id.oneme_poll_create__answer_item_viewtype && (i = i + 1) < 0) {
                    xw3.U0();
                    throw null;
                }
            }
        }
        this.h = i;
    }

    @Override // defpackage.kn8
    public final void S0(int i, int i2) {
        if (i2 <= 0 || i2 >= l() || ((o7d) ((k79) F(i2))).getF() != R.id.oneme_poll_create__answer_item_viewtype) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.d.f);
        p90.H(i, i2, arrayList);
        H(arrayList);
    }

    @Override // defpackage.nee
    public final void v(lfe lfeVar, int i, List list) {
        w7d w7dVar = (w7d) lfeVar;
        o7d o7dVar = (o7d) ((k79) F(i));
        int f = o7dVar.getF();
        q7d q7dVar = this.f;
        if (f == R.id.oneme_poll_create__answer_item_viewtype) {
            final d6d d6dVar = w7dVar instanceof d6d ? (d6d) w7dVar : null;
            if (d6dVar != null) {
                final l7d l7dVar = (l7d) o7dVar;
                d6dVar.B(l7dVar);
                d6dVar.u = q7dVar;
                d6dVar.w = this.g;
                z5d z5dVar = (z5d) d6dVar.a;
                final int i2 = 0;
                z5dVar.setOnEditorActionListener(new cf7() { // from class: c6d
                    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        boolean z;
                        q7d q7dVar2;
                        int i3 = i2;
                        l7d l7dVar2 = l7dVar;
                        d6d d6dVar2 = d6dVar;
                        switch (i3) {
                            case 0:
                                if (((Integer) obj).intValue() == 5 && (q7dVar2 = d6dVar2.u) != null) {
                                    z = q7dVar2.a(Long.valueOf(l7dVar2.c));
                                }
                                return Boolean.valueOf(z);
                            default:
                                CharSequence charSequence = (CharSequence) obj;
                                q7d q7dVar3 = d6dVar2.u;
                                if (q7dVar3 != null) {
                                    q7dVar3.b(l7dVar2.c, charSequence.toString());
                                }
                                return sbi.a;
                        }
                    }
                });
                z5dVar.setOnRemoveListener(new vx9(d6dVar, 25, l7dVar));
                final int i3 = 1;
                d6dVar.v = (a3) z5dVar.b.k(new cf7() { // from class: c6d
                    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        boolean z;
                        q7d q7dVar2;
                        int i4 = i3;
                        l7d l7dVar2 = l7dVar;
                        d6d d6dVar2 = d6dVar;
                        switch (i4) {
                            case 0:
                                if (((Integer) obj).intValue() == 5 && (q7dVar2 = d6dVar2.u) != null) {
                                    z = q7dVar2.a(Long.valueOf(l7dVar2.c));
                                }
                                return Boolean.valueOf(z);
                            default:
                                CharSequence charSequence = (CharSequence) obj;
                                q7d q7dVar3 = d6dVar2.u;
                                if (q7dVar3 != null) {
                                    q7dVar3.b(l7dVar2.c, charSequence.toString());
                                }
                                return sbi.a;
                        }
                    }
                });
                z5dVar.setOnDragIconTouchListener(new uv2(d6dVar, 6, z5dVar));
                return;
            }
            return;
        }
        if (f != R.id.oneme_poll_create__setting_item_viewtype) {
            w7dVar.B(o7dVar);
            return;
        }
        z9d z9dVar = w7dVar instanceof z9d ? (z9d) w7dVar : null;
        if (z9dVar != null) {
            View view = z9dVar.a;
            m7d m7dVar = (m7d) o7dVar;
            atf atfVar = (atf) view;
            atfVar.setTitle(m7dVar.a);
            ksf ksfVar = m7dVar.b;
            atfVar.setEndView(ksfVar);
            atfVar.setChecked(ksfVar.a);
            atf atfVar2 = (atf) view;
            qe7.H(atfVar2, 300L, new gwc(q7dVar, m7dVar));
            atfVar2.setOnSwitchCheckedListener(new s81(q7dVar, 13, m7dVar));
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.oneme_poll_create__title_item_viewtype) {
            return new cad(viewGroup.getContext(), new rea(2, this.f, q7d.class, "onTextFieldChanged", "onTextFieldChanged(JLjava/lang/String;)V", 0, 12));
        }
        if (i == R.id.oneme_poll_create__answer_item_viewtype) {
            return new d6d(new z5d(viewGroup.getContext()));
        }
        if (i == R.id.oneme_poll_create__add_answer_item_viewtype) {
            Context context = viewGroup.getContext();
            g6b g6bVar = new g6b(0, this.f, q7d.class, "addNewAnswerClick", "addNewAnswerClick(Ljava/lang/Long;)Z", 8, 1);
            p5d p5dVar = new p5d(context);
            q5d q5dVar = new q5d(p5dVar);
            qe7.H(p5dVar, 300L, new gwc(2, g6bVar));
            return q5dVar;
        }
        if (i != R.id.oneme_poll_create__setting_item_viewtype) {
            ore.p(c0a.k(i, "Unknown view type ", "!"));
            return null;
        }
        atf atfVar = new atf(viewGroup.getContext());
        z9d z9dVar = new z9d(atfVar);
        atfVar.setStartView(null);
        atfVar.onThemeChanged(pq3.j.h(atfVar));
        return z9dVar;
    }
}
