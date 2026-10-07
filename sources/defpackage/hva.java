package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class hva {
    public final RecyclerView a;
    public final ita b;
    public final a6f c;
    public final qpa d;
    public final oqa e;
    public final String f = hva.class.getName();
    public boolean g = true;

    public hva(k96 k96Var, ita itaVar, a6f a6fVar, qpa qpaVar, oqa oqaVar) {
        this.a = k96Var;
        this.b = itaVar;
        this.c = a6fVar;
        this.d = qpaVar;
        this.e = oqaVar;
    }

    public final MessagesLayoutManager a() {
        LinearLayoutManager linearLayoutManagerE0 = tre.e0(this.a);
        if (linearLayoutManagerE0 instanceof MessagesLayoutManager) {
            return (MessagesLayoutManager) linearLayoutManagerE0;
        }
        return null;
    }

    public final boolean b(long j) {
        LinearLayoutManager linearLayoutManagerE0 = tre.e0(this.a);
        if (linearLayoutManagerE0 == null) {
            ore.k("Only linear layout is supported");
            return false;
        }
        int iU0 = linearLayoutManagerE0.U0();
        qpa qpaVar = this.d;
        MessageModel messageModelQ = qpaVar.Q(iU0);
        if (messageModelQ != null) {
            long j2 = messageModelQ.c;
            MessageModel messageModelQ2 = qpaVar.Q(linearLayoutManagerE0.Y0());
            if (messageModelQ2 != null) {
                long j3 = messageModelQ2.c;
                if (j2 <= j && j <= j3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0177  */
    /* JADX WARN: Code duplicated, block: B:102:0x0179  */
    /* JADX WARN: Code duplicated, block: B:104:0x0181  */
    /* JADX WARN: Code duplicated, block: B:105:0x0184  */
    /* JADX WARN: Code duplicated, block: B:131:0x022c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0238  */
    /* JADX WARN: Code duplicated, block: B:138:0x0240  */
    /* JADX WARN: Code duplicated, block: B:142:0x0253  */
    /* JADX WARN: Code duplicated, block: B:144:0x0259  */
    /* JADX WARN: Code duplicated, block: B:157:0x0290  */
    /* JADX WARN: Code duplicated, block: B:158:0x0295  */
    /* JADX WARN: Code duplicated, block: B:162:0x029d  */
    /* JADX WARN: Code duplicated, block: B:166:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:170:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:173:0x02df  */
    /* JADX WARN: Code duplicated, block: B:175:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:181:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:193:0x033e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0354  */
    /* JADX WARN: Code duplicated, block: B:197:0x0357  */
    /* JADX WARN: Code duplicated, block: B:200:0x035f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0365  */
    /* JADX WARN: Code duplicated, block: B:203:0x0367  */
    /* JADX WARN: Code duplicated, block: B:205:0x036f  */
    /* JADX WARN: Code duplicated, block: B:207:0x037b  */
    /* JADX WARN: Code duplicated, block: B:209:0x0389  */
    /* JADX WARN: Code duplicated, block: B:211:0x038f  */
    /* JADX WARN: Code duplicated, block: B:225:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:240:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:242:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:244:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:246:0x0407  */
    /* JADX WARN: Code duplicated, block: B:248:0x0413  */
    /* JADX WARN: Code duplicated, block: B:250:0x0419  */
    /* JADX WARN: Code duplicated, block: B:252:0x041d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x041f  */
    /* JADX WARN: Code duplicated, block: B:256:0x0426  */
    /* JADX WARN: Code duplicated, block: B:262:0x0437  */
    /* JADX WARN: Code duplicated, block: B:263:0x043d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0441  */
    /* JADX WARN: Code duplicated, block: B:267:0x0447  */
    /* JADX WARN: Code duplicated, block: B:268:0x044b  */
    /* JADX WARN: Code duplicated, block: B:272:0x0457  */
    /* JADX WARN: Code duplicated, block: B:276:0x046c  */
    /* JADX WARN: Code duplicated, block: B:278:0x0470  */
    /* JADX WARN: Code duplicated, block: B:281:0x0477  */
    /* JADX WARN: Code duplicated, block: B:299:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x011f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0129  */
    public final boolean c() {
        boolean z;
        long j;
        boolean z2;
        MessagesLayoutManager messagesLayoutManagerA;
        String str;
        a4c a4cVar;
        long j2;
        MessageModel messageModelQ;
        f9b f9bVar;
        x5f x5fVar;
        String str2;
        a4c a4cVar2;
        MessagesLayoutManager messagesLayoutManagerA2;
        boolean z3;
        qpa qpaVar;
        LinearLayoutManager linearLayoutManagerE0;
        MessageModel messageModelQ2;
        long j3;
        MessageModel messageModelQ3;
        String str3;
        a4c a4cVar3;
        int i;
        MessagesLayoutManager messagesLayoutManagerA3;
        String str4;
        a4c a4cVar4;
        LinearLayoutManager linearLayoutManagerE1;
        MessageModel messageModelQ4;
        boolean z4;
        long j4;
        MessageModel messageModelQ5;
        View viewR;
        ita itaVar;
        RecyclerView recyclerView;
        Object value;
        String str5;
        a4c a4cVar5;
        x5f x5fVarF;
        int i2;
        String str6;
        a4c a4cVar6;
        String str7;
        a4c a4cVar7;
        i5f i5fVar;
        i5f i5fVar2;
        i5f i5fVar3 = i5f.a;
        je9 je9Var = je9.d;
        je9 je9Var2 = je9.f;
        if (this.c.f() == null) {
            gm0.Y(this.f, "Scroll: No events for scrolling, skip event");
            return true;
        }
        x5f x5fVarF2 = this.c.f();
        long j5 = x5fVarF2 != null ? x5fVarF2.a : 0L;
        a6f a6fVar = this.c;
        x5f x5fVar2 = null;
        if (j5 == Long.MIN_VALUE) {
            x5f x5fVarF3 = a6fVar.f();
            if (x5fVarF3 != null && (i5fVar2 = x5fVarF3.d) != null) {
                i5fVar3 = i5fVar2;
            }
            f9b f9bVar2 = (f9b) this.c.b;
            x5f x5fVar3 = (x5f) f9bVar2.getValue();
            if (x5fVar3 != null) {
                f9bVar2.setValue(null);
                x5fVar2 = x5fVar3;
            }
            if (x5fVar2 == null) {
                return true;
            }
            MessagesLayoutManager messagesLayoutManagerA4 = a();
            if (messagesLayoutManagerA4 != null) {
                messagesLayoutManagerA4.F = i5fVar3;
            }
            this.a.w0(0);
            return true;
        }
        x5f x5fVarF4 = a6fVar.f();
        long j6 = x5fVarF4 != null ? x5fVarF4.a : 0L;
        x5f x5fVarF5 = this.c.f();
        if (x5fVarF5 != null && (i5fVar = x5fVarF5.d) != null) {
            i5fVar3 = i5fVar;
        }
        boolean z5 = i5fVar3 == i5f.b;
        x5f x5fVarF6 = this.c.f();
        long j7 = x5fVarF6 != null ? x5fVarF6.g : -1L;
        x5f x5fVarF7 = this.c.f();
        int i3 = x5fVarF7 != null ? x5fVarF7.f : -1;
        int iD = this.d.d(j6);
        if (iD >= 0 && z5) {
            z = false;
            int i4 = iD + 1;
            MessageModel messageModelQ6 = this.d.Q(i4);
            j = j6;
            if (messageModelQ6 != null && messageModelQ6.c == j) {
                Iterator it = oc9.f0(i4, this.d.l()).iterator();
                boolean z6 = false;
                Object obj = null;
                while (true) {
                    gj8 gj8Var = (gj8) it;
                    if (!gj8Var.c) {
                        break;
                    }
                    Object next = gj8Var.next();
                    MessageModel messageModelQ7 = this.d.Q(((Number) next).intValue());
                    Object obj2 = obj;
                    boolean z7 = z6;
                    if (messageModelQ7 == null || messageModelQ7.c != j) {
                        obj = obj2;
                        z6 = z7;
                    } else {
                        obj = next;
                        z6 = true;
                    }
                }
                Object obj3 = obj;
                if (!z6) {
                    ore.f("Collection contains no element matching the predicate.");
                    return false;
                }
                int iIntValue = ((Number) obj3).intValue();
                boolean z8 = iIntValue != iD;
                iD = iIntValue;
                z2 = z8;
            }
            messagesLayoutManagerA = a();
            if (messagesLayoutManagerA != null) {
                messagesLayoutManagerA.H = messagesLayoutManagerA.G();
            }
            if (iD < 0) {
                str6 = this.f;
                a4cVar6 = gm0.f;
                if (a4cVar6 != null && a4cVar6.b(je9Var2)) {
                    a4cVar6.c(je9Var2, str6, c0a.k(iD, "Scroll: Got non-existing pos=", ". Try scroll to lastMessage if need"), null);
                }
                MessageModel messageModelP = this.d.P();
                if (z5 && j7 > 0 && messageModelP != null && messageModelP.a == j7) {
                    iD = xw3.O0(this.d.d.f);
                    str7 = this.f;
                    a4cVar7 = gm0.f;
                    if (a4cVar7 != null && a4cVar7.b(je9Var2)) {
                        a4cVar7.c(je9Var2, str7, zo5.h(iD, "Scroll: Try scroll by lasIndex: "), null);
                    }
                }
            }
            if (iD < 0) {
                str = this.f;
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var2)) {
                    a4cVar.c(je9Var2, str, zo5.h(iD, "Scroll: Got non-existing pos="), null);
                }
            } else {
                if (iD == 0) {
                    x5fVarF = this.c.f();
                    if (x5fVarF != null) {
                        i2 = x5fVarF.f;
                    } else {
                        i2 = -1;
                    }
                    if (i2 > 0) {
                        str = this.f;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            a4cVar.c(je9Var2, str, zo5.h(iD, "Scroll: Got non-existing pos="), null);
                        }
                    }
                }
                qpa qpaVar2 = this.d;
                int iAbs = Math.abs(qpaVar2.d.f.size() - qpaVar2.v.size()) + i3;
                if (z5 || j7 <= 0 || iAbs <= 0 || iD == iAbs) {
                    z2 = z2;
                } else {
                    qpa qpaVar3 = this.d;
                    int iAbs2 = Math.abs(qpaVar3.d.f.size() - qpaVar3.v.size()) + i3;
                    String str8 = this.f;
                    a4c a4cVar8 = gm0.f;
                    if (a4cVar8 != null && a4cVar8.b(je9Var2)) {
                        StringBuilder sbP = qv1.p("Scroll: founded pos not equals to approximate, try find pos by approximateIndex. \n                    |pos:", iD, ", apP:", i3, ", apPD:");
                        sbP.append(iAbs2);
                        sbP.append(", msgId:");
                        sbP.append(j7);
                        a4cVar8.c(je9Var2, str8, s5h.y0(sbP.toString()), null);
                    }
                    MessageModel messageModelQ8 = this.d.Q(iAbs2);
                    if (messageModelQ8 != null && messageModelQ8.a == j7) {
                        String str9 = this.f;
                        a4c a4cVar9 = gm0.f;
                        if (a4cVar9 != null && a4cVar9.b(je9Var2)) {
                            a4cVar9.c(je9Var2, str9, s5h.y0("Scroll: found pos by approximateIndex. \n                        |apPD:" + iAbs2 + ", msgId:" + j7), null);
                        }
                        j2 = messageModelQ8.c;
                        iD = iAbs2;
                    }
                    messageModelQ = this.d.Q(iD);
                    if (messageModelQ == null) {
                        str5 = this.f;
                        a4cVar5 = gm0.f;
                        if (a4cVar5 != null && a4cVar5.b(je9Var2)) {
                            a4cVar5.c(je9Var2, str5, c0a.k(iD, "Scroll: Can't scroll to msg by pos:", " because msg doesn't exist, try later"), null);
                            return z;
                        }
                    } else {
                        long j8 = messageModelQ.a;
                        if (j7 > 0 || j8 <= 0 || j7 == j8) {
                            f9bVar = (f9b) this.c.b;
                            x5fVar = (x5f) f9bVar.getValue();
                            if (x5fVar != null) {
                                f9bVar.setValue(null);
                            } else {
                                x5fVar = null;
                            }
                            str2 = this.f;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str2, "Scroll: vh for pos #" + iD + "=" + this.a.K(iD) + ", event=" + x5fVar, null);
                            }
                            if (x5fVar == null) {
                                gm0.Y(this.f, "Scroll: No events for scrolling, skip event");
                                return true;
                            }
                            messagesLayoutManagerA2 = a();
                            if (messagesLayoutManagerA2 != null) {
                                messagesLayoutManagerA2.F = i5fVar3;
                            }
                            if (x5fVar.e) {
                                itaVar = this.b;
                                if (itaVar.d != 0 && (!itaVar.e.isEmpty() || itaVar.f)) {
                                    recyclerView = this.a;
                                    if (recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
                                        recyclerView.addOnLayoutChangeListener(new xc0(12, this));
                                    } else {
                                        String str10 = this.f;
                                        a4c a4cVar10 = gm0.f;
                                        if (a4cVar10 != null && a4cVar10.b(je9Var)) {
                                            a4cVar10.c(je9Var, str10, zo5.j(this.b.d, "Scroll: Highlighted from args message with id="), null);
                                        }
                                        oqa oqaVar = this.e;
                                        ita itaVar2 = this.b;
                                        long j9 = itaVar2.d;
                                        List list = itaVar2.e;
                                        mjg mjgVar = oqaVar.e;
                                        do {
                                            value = mjgVar.getValue();
                                        } while (!mjgVar.h(value, new zv7(j9, list)));
                                    }
                                }
                            }
                            if (iD == xw3.O0(this.d.d.f)) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (x5fVar.h != 0) {
                                qpaVar = this.d;
                                linearLayoutManagerE0 = tre.e0(this.a);
                                if (linearLayoutManagerE0 == null) {
                                    ore.k("Only linear layout is supported");
                                    return z;
                                }
                                messageModelQ2 = qpaVar.Q(linearLayoutManagerE0.X0());
                                if (messageModelQ2 != null) {
                                    j3 = messageModelQ2.c;
                                    messageModelQ3 = qpaVar.Q(linearLayoutManagerE0.Z0());
                                    if (messageModelQ3 != null) {
                                        long j10 = messageModelQ3.c;
                                        if (j3 <= j2 && j2 <= j10) {
                                            if (!z2) {
                                                str3 = this.f;
                                                a4cVar3 = gm0.f;
                                                if (a4cVar3 != null) {
                                                    return true;
                                                }
                                                a4cVar3.c(je9Var, str3, "Scroll: vh is already visible on screen, skip event", null);
                                                return true;
                                            }
                                        }
                                    }
                                }
                            } else if (b(j2)) {
                                if (!z2) {
                                    str3 = this.f;
                                    a4cVar3 = gm0.f;
                                    if (a4cVar3 != null || !a4cVar3.b(je9Var)) {
                                        return true;
                                    }
                                    a4cVar3.c(je9Var, str3, "Scroll: vh is already visible on screen, skip event", null);
                                    return true;
                                }
                            } else if (!z3) {
                                linearLayoutManagerE1 = tre.e0(this.a);
                                if (linearLayoutManagerE1 == null) {
                                    ore.k("Only linear layout is supported");
                                    return z;
                                }
                                int iX0 = linearLayoutManagerE1.X0();
                                messageModelQ4 = this.d.Q(iX0);
                                if (messageModelQ4 != null) {
                                    j4 = messageModelQ4.c;
                                    int iZ0 = linearLayoutManagerE1.Z0();
                                    messageModelQ5 = this.d.Q(iZ0);
                                    if (messageModelQ5 != null) {
                                        long j11 = messageModelQ5.c;
                                        if (j4 <= j2 || j2 > j11) {
                                            z4 = z;
                                        } else if (iX0 == iZ0) {
                                            gm0.n(this.f, "Scroll: big message visible, first == last");
                                            z4 = true;
                                        } else {
                                            if (j2 == j11) {
                                                iX0 = iZ0;
                                            } else if (j2 != j4) {
                                                iX0 = -1;
                                            }
                                            if (iX0 == -1 || (viewR = linearLayoutManagerE1.r(iX0)) == null) {
                                                z4 = z;
                                            } else {
                                                Rect rect = n7j.a;
                                                z4 = (!viewR.getLocalVisibleRect(rect) || ((float) rect.height()) < ((float) viewR.getMeasuredHeight()) * 0.3f) ? z : true;
                                                String str11 = this.f;
                                                a4c a4cVar11 = gm0.f;
                                                if (a4cVar11 != null && a4cVar11.b(je9Var)) {
                                                    a4cVar11.c(je9Var, str11, zo5.s("Scroll: big message visible enough: ", z4), null);
                                                }
                                            }
                                        }
                                    } else {
                                        z4 = z;
                                    }
                                } else {
                                    z4 = z;
                                }
                                if (z4) {
                                    if (!z2) {
                                        str3 = this.f;
                                        a4cVar3 = gm0.f;
                                        if (a4cVar3 != null) {
                                            return true;
                                        }
                                        a4cVar3.c(je9Var, str3, "Scroll: vh is already visible on screen, skip event", null);
                                        return true;
                                    }
                                }
                            }
                            if (x5fVar.c) {
                                this.a.A0(iD);
                            } else {
                                i = x5fVar.h;
                                if (i != 0) {
                                    messagesLayoutManagerA3 = a();
                                    if (messagesLayoutManagerA3 != null) {
                                        messagesLayoutManagerA3.p1(iD, i);
                                    }
                                } else {
                                    this.a.w0(iD);
                                }
                            }
                            str4 = this.f;
                            a4cVar4 = gm0.f;
                            if (a4cVar4 != null || !a4cVar4.b(je9Var)) {
                                return true;
                            }
                            a4cVar4.c(je9Var, str4, qv1.k("Scroll: Scrolled to message=", messageModelQ.x()), null);
                            return true;
                        }
                        String str12 = this.f;
                        a4c a4cVar12 = gm0.f;
                        if (a4cVar12 != null && a4cVar12.b(je9Var2)) {
                            a4cVar12.c(je9Var2, str12, qt4.k(j7, ", correct msgId:", c0a.q(iD, j8, "Scroll: Got wrong message msgId=", " by pos:")), null);
                            return z;
                        }
                    }
                }
                j2 = j;
                messageModelQ = this.d.Q(iD);
                if (messageModelQ == null) {
                    long j12 = messageModelQ.a;
                    if (j7 > 0) {
                    }
                    f9bVar = (f9b) this.c.b;
                    x5fVar = (x5f) f9bVar.getValue();
                    if (x5fVar != null) {
                        f9bVar.setValue(null);
                    } else {
                        x5fVar = null;
                    }
                    str2 = this.f;
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        a4cVar2.c(je9Var, str2, "Scroll: vh for pos #" + iD + "=" + this.a.K(iD) + ", event=" + x5fVar, null);
                    }
                    if (x5fVar == null) {
                        gm0.Y(this.f, "Scroll: No events for scrolling, skip event");
                        return true;
                    }
                    messagesLayoutManagerA2 = a();
                    if (messagesLayoutManagerA2 != null) {
                        messagesLayoutManagerA2.F = i5fVar3;
                    }
                    if (x5fVar.e) {
                        itaVar = this.b;
                        if (itaVar.d != 0) {
                            recyclerView = this.a;
                            if (recyclerView.isLaidOut()) {
                                recyclerView.addOnLayoutChangeListener(new xc0(12, this));
                            } else {
                                recyclerView.addOnLayoutChangeListener(new xc0(12, this));
                            }
                        }
                    }
                    if (iD == xw3.O0(this.d.d.f)) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (x5fVar.h != 0) {
                        qpaVar = this.d;
                        linearLayoutManagerE0 = tre.e0(this.a);
                        if (linearLayoutManagerE0 == null) {
                            ore.k("Only linear layout is supported");
                            return z;
                        }
                        messageModelQ2 = qpaVar.Q(linearLayoutManagerE0.X0());
                        if (messageModelQ2 != null) {
                            j3 = messageModelQ2.c;
                            messageModelQ3 = qpaVar.Q(linearLayoutManagerE0.Z0());
                            if (messageModelQ3 != null) {
                                long j13 = messageModelQ3.c;
                                if (j3 <= j2) {
                                    if (!z2) {
                                        str3 = this.f;
                                        a4cVar3 = gm0.f;
                                        if (a4cVar3 != null) {
                                            return true;
                                        }
                                        a4cVar3.c(je9Var, str3, "Scroll: vh is already visible on screen, skip event", null);
                                        return true;
                                    }
                                }
                            }
                        }
                    } else if (b(j2)) {
                        if (!z2) {
                            str3 = this.f;
                            a4cVar3 = gm0.f;
                            if (a4cVar3 != null) {
                                return true;
                            }
                            a4cVar3.c(je9Var, str3, "Scroll: vh is already visible on screen, skip event", null);
                            return true;
                        }
                    } else if (!z3) {
                        linearLayoutManagerE1 = tre.e0(this.a);
                        if (linearLayoutManagerE1 == null) {
                            ore.k("Only linear layout is supported");
                            return z;
                        }
                        int iX1 = linearLayoutManagerE1.X0();
                        messageModelQ4 = this.d.Q(iX1);
                        if (messageModelQ4 != null) {
                            j4 = messageModelQ4.c;
                            int iZ1 = linearLayoutManagerE1.Z0();
                            messageModelQ5 = this.d.Q(iZ1);
                            if (messageModelQ5 != null) {
                                long j14 = messageModelQ5.c;
                                if (j4 <= j2) {
                                    z4 = z;
                                } else {
                                    z4 = z;
                                }
                            } else {
                                z4 = z;
                            }
                        } else {
                            z4 = z;
                        }
                        if (z4) {
                            if (!z2) {
                                str3 = this.f;
                                a4cVar3 = gm0.f;
                                if (a4cVar3 != null) {
                                    return true;
                                }
                                a4cVar3.c(je9Var, str3, "Scroll: vh is already visible on screen, skip event", null);
                                return true;
                            }
                        }
                    }
                    if (x5fVar.c) {
                        this.a.A0(iD);
                    } else {
                        i = x5fVar.h;
                        if (i != 0) {
                            messagesLayoutManagerA3 = a();
                            if (messagesLayoutManagerA3 != null) {
                                messagesLayoutManagerA3.p1(iD, i);
                            }
                        } else {
                            this.a.w0(iD);
                        }
                    }
                    str4 = this.f;
                    a4cVar4 = gm0.f;
                    if (a4cVar4 != null) {
                        return true;
                    }
                    a4cVar4.c(je9Var, str4, qv1.k("Scroll: Scrolled to message=", messageModelQ.x()), null);
                    return true;
                }
                str5 = this.f;
                a4cVar5 = gm0.f;
                if (a4cVar5 != null) {
                    a4cVar5.c(je9Var2, str5, c0a.k(iD, "Scroll: Can't scroll to msg by pos:", " because msg doesn't exist, try later"), null);
                    return z;
                }
            }
            return z;
        }
        z = false;
        j = j6;
        z2 = z;
        messagesLayoutManagerA = a();
        if (messagesLayoutManagerA != null) {
            messagesLayoutManagerA.H = messagesLayoutManagerA.G();
        }
        if (iD < 0) {
            str6 = this.f;
            a4cVar6 = gm0.f;
            if (a4cVar6 != null) {
                a4cVar6.c(je9Var2, str6, c0a.k(iD, "Scroll: Got non-existing pos=", ". Try scroll to lastMessage if need"), null);
            }
            MessageModel messageModelP2 = this.d.P();
            if (z5) {
                iD = xw3.O0(this.d.d.f);
                str7 = this.f;
                a4cVar7 = gm0.f;
                if (a4cVar7 != null) {
                    a4cVar7.c(je9Var2, str7, zo5.h(iD, "Scroll: Try scroll by lasIndex: "), null);
                }
            }
        }
        if (iD < 0) {
            str = this.f;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                a4cVar.c(je9Var2, str, zo5.h(iD, "Scroll: Got non-existing pos="), null);
            }
        } else {
            if (iD == 0) {
                x5fVarF = this.c.f();
                if (x5fVarF != null) {
                    i2 = x5fVarF.f;
                } else {
                    i2 = -1;
                }
                if (i2 > 0) {
                    str = this.f;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var2, str, zo5.h(iD, "Scroll: Got non-existing pos="), null);
                    }
                }
            }
            qpa qpaVar4 = this.d;
            int iAbs3 = Math.abs(qpaVar4.d.f.size() - qpaVar4.v.size()) + i3;
            if (z5) {
                z2 = z2;
                j2 = j;
            } else {
                z2 = z2;
                j2 = j;
            }
            messageModelQ = this.d.Q(iD);
            if (messageModelQ == null) {
                long j15 = messageModelQ.a;
                if (j7 > 0) {
                }
                f9bVar = (f9b) this.c.b;
                x5fVar = (x5f) f9bVar.getValue();
                if (x5fVar != null) {
                    f9bVar.setValue(null);
                } else {
                    x5fVar = null;
                }
                str2 = this.f;
                a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    a4cVar2.c(je9Var, str2, "Scroll: vh for pos #" + iD + "=" + this.a.K(iD) + ", event=" + x5fVar, null);
                }
                if (x5fVar == null) {
                    gm0.Y(this.f, "Scroll: No events for scrolling, skip event");
                    return true;
                }
                messagesLayoutManagerA2 = a();
                if (messagesLayoutManagerA2 != null) {
                    messagesLayoutManagerA2.F = i5fVar3;
                }
                if (x5fVar.e) {
                    itaVar = this.b;
                    if (itaVar.d != 0) {
                        recyclerView = this.a;
                        if (recyclerView.isLaidOut()) {
                            recyclerView.addOnLayoutChangeListener(new xc0(12, this));
                        } else {
                            recyclerView.addOnLayoutChangeListener(new xc0(12, this));
                        }
                    }
                }
                if (iD == xw3.O0(this.d.d.f)) {
                    z3 = true;
                } else {
                    z3 = z;
                }
                if (x5fVar.h != 0) {
                    qpaVar = this.d;
                    linearLayoutManagerE0 = tre.e0(this.a);
                    if (linearLayoutManagerE0 == null) {
                        ore.k("Only linear layout is supported");
                        return z;
                    }
                    messageModelQ2 = qpaVar.Q(linearLayoutManagerE0.X0());
                    if (messageModelQ2 != null) {
                        j3 = messageModelQ2.c;
                        messageModelQ3 = qpaVar.Q(linearLayoutManagerE0.Z0());
                        if (messageModelQ3 != null) {
                            long j16 = messageModelQ3.c;
                            if (j3 <= j2) {
                                if (!z2) {
                                    str3 = this.f;
                                    a4cVar3 = gm0.f;
                                    if (a4cVar3 != null) {
                                        return true;
                                    }
                                    a4cVar3.c(je9Var, str3, "Scroll: vh is already visible on screen, skip event", null);
                                    return true;
                                }
                            }
                        }
                    }
                } else if (b(j2)) {
                    if (!z2) {
                        str3 = this.f;
                        a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            return true;
                        }
                        a4cVar3.c(je9Var, str3, "Scroll: vh is already visible on screen, skip event", null);
                        return true;
                    }
                } else if (!z3) {
                    linearLayoutManagerE1 = tre.e0(this.a);
                    if (linearLayoutManagerE1 == null) {
                        ore.k("Only linear layout is supported");
                        return z;
                    }
                    int iX2 = linearLayoutManagerE1.X0();
                    messageModelQ4 = this.d.Q(iX2);
                    if (messageModelQ4 != null) {
                        j4 = messageModelQ4.c;
                        int iZ2 = linearLayoutManagerE1.Z0();
                        messageModelQ5 = this.d.Q(iZ2);
                        if (messageModelQ5 != null) {
                            long j17 = messageModelQ5.c;
                            if (j4 <= j2) {
                                z4 = z;
                            } else {
                                z4 = z;
                            }
                        } else {
                            z4 = z;
                        }
                    } else {
                        z4 = z;
                    }
                    if (z4) {
                        if (!z2) {
                            str3 = this.f;
                            a4cVar3 = gm0.f;
                            if (a4cVar3 != null) {
                                return true;
                            }
                            a4cVar3.c(je9Var, str3, "Scroll: vh is already visible on screen, skip event", null);
                            return true;
                        }
                    }
                }
                if (x5fVar.c) {
                    this.a.A0(iD);
                } else {
                    i = x5fVar.h;
                    if (i != 0) {
                        messagesLayoutManagerA3 = a();
                        if (messagesLayoutManagerA3 != null) {
                            messagesLayoutManagerA3.p1(iD, i);
                        }
                    } else {
                        this.a.w0(iD);
                    }
                }
                str4 = this.f;
                a4cVar4 = gm0.f;
                if (a4cVar4 != null) {
                    return true;
                }
                a4cVar4.c(je9Var, str4, qv1.k("Scroll: Scrolled to message=", messageModelQ.x()), null);
                return true;
            }
            str5 = this.f;
            a4cVar5 = gm0.f;
            if (a4cVar5 != null) {
                a4cVar5.c(je9Var2, str5, c0a.k(iD, "Scroll: Can't scroll to msg by pos:", " because msg doesn't exist, try later"), null);
                return z;
            }
        }
        return z;
    }
}
