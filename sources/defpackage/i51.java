package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class i51 {
    public final ny8 a;

    public i51(ny8 ny8Var) {
        this.a = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x0152 A[EDGE_INSN: B:93:0x0152->B:94:0x0154 BREAK  A[LOOP:2: B:88:0x013d->B:112:?]] */
    public final Object a(Set set, Long l, CharSequence charSequence, m8b m8bVar, nq4 nq4Var) {
        h51 h51Var;
        int i;
        y3f y3fVar;
        if (nq4Var instanceof h51) {
            h51Var = (h51) nq4Var;
            int i2 = h51Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h51Var.i = i2 - Integer.MIN_VALUE;
            } else {
                h51Var = new h51(this, nq4Var);
            }
        } else {
            h51Var = new h51(this, nq4Var);
        }
        Object objJ = h51Var.g;
        int i3 = h51Var.i;
        if (i3 == 0) {
            ch3.d0(objJ);
            if (set == null || set.isEmpty()) {
                gm0.Y(i51.class.getName(), "Early return in invoke cuz of fwdMsgIds.isNullOrEmpty()");
                return null;
            }
            sua suaVar = (sua) this.a.getValue();
            h51Var.d = l;
            h51Var.e = charSequence;
            h51Var.f = m8bVar;
            h51Var.i = 1;
            objJ = suaVar.j(set, h51Var);
            hu4 hu4Var = hu4.a;
            if (objJ == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m8bVar = h51Var.f;
            charSequence = h51Var.e;
            l = h51Var.d;
            ch3.d0(objJ);
        }
        List list = (List) objJ;
        int size = list.size();
        if (charSequence != null && charSequence.length() > 0) {
            size++;
        }
        int i4 = size * m8bVar.d;
        List list2 = list;
        boolean z = list2 instanceof Collection;
        int i5 = 0;
        if (z && list2.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list2.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((sfa) it.next()).W() && (i = i + 1) < 0) {
                    xw3.U0();
                    throw null;
                }
            }
        }
        int i6 = i * m8bVar.d;
        if (!z || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((sfa) it2.next()).J() && (i5 = i5 + 1) < 0) {
                    xw3.U0();
                    throw null;
                }
            }
        }
        int i7 = i5 * m8bVar.d;
        if (l != null && (!z || !list2.isEmpty())) {
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    if (l != null) {
                        if (l != null) {
                            y3fVar = y3f.CHAT;
                            break;
                        }
                        y3fVar = y3f.CHAT;
                        break;
                    }
                    if (l != null) {
                        y3fVar = y3f.CHAT;
                        break;
                    }
                    y3fVar = y3f.CHAT;
                    break;
                }
                sfa sfaVar = (sfa) it3.next();
                if (sfaVar.R() || sfaVar.Z()) {
                    y3fVar = y3f.CHAT_ATTACHMENTS_MEDIA;
                }
            }
        } else if (l != null && (!z || !list2.isEmpty())) {
            Iterator it4 = list2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    if (l != null) {
                        y3fVar = y3f.CHAT;
                        break;
                    }
                    y3fVar = y3f.CHAT;
                    break;
                }
                if (((sfa) it4.next()).P()) {
                    y3fVar = y3f.CHAT_ATTACHMENTS_FILES;
                }
            }
        } else if (l != null && (!z || !list2.isEmpty())) {
            Iterator it5 = list2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    y3fVar = y3f.CHAT;
                    break;
                }
                if (((sfa) it5.next()).F()) {
                    y3fVar = y3f.CHAT_ATTACHMENTS_LINKS;
                    break;
                }
            }
        } else {
            y3fVar = y3f.CHAT;
            break;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new ha8(fa8.SEND_5_MESSAGES, i4));
        if (i6 > 0) {
            linkedHashSet.add(new ha8(fa8.SEND_3_STICKERS, i6));
        }
        if (i7 > 0) {
            linkedHashSet.add(new ha8(fa8.SEND_AUDIO_MESSAGE, i7));
        }
        return new n87(linkedHashSet, y3fVar);
    }
}
