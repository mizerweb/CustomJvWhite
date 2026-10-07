package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class c92 {
    public long a;
    public final ArrayList b;
    public final long c;
    public final long d;
    public Serializable e;

    public c92(long j) {
        this.b = new ArrayList();
        this.e = new ArrayList();
        this.d = j;
        this.a = 14400000L;
        this.c = 10L;
    }

    public j3b a() {
        long j = this.c;
        if (j != -1) {
            long j2 = this.d;
            if (j2 != -1) {
                return new j3b(this.a, j, j2, (mg5) this.e);
            }
        }
        return new j3b(this.a, this.b, (mg5) this.e);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x00fe  */
    public void b(ArrayList arrayList, int i, int i2) {
        fda fdaVar;
        fda fdaVar2;
        b92 b92Var;
        vg4 vg4Var;
        rt2 rt2Var;
        int i3;
        rt2 rt2Var2;
        boolean z;
        b92 b92Var2;
        if (i > i2 || i >= arrayList.size() || i2 >= arrayList.size()) {
            StringBuilder sbP = qv1.p("merge: wrong index: start: ", i, " end: ", i2, " size: ");
            sbP.append(arrayList.size());
            gm0.n("c92", sbP.toString());
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = i2; i4 >= i; i4 = i3 - 1) {
            b92 b92Var3 = (b92) arrayList.get(i4);
            if (arrayList3.size() == 0) {
                arrayList3.add(b92Var3);
                i3 = i4;
            } else {
                b92 b92Var4 = (b92) qv1.f(1, arrayList3);
                fda fdaVar3 = b92Var3.c;
                boolean zH = fdaVar3.a.o().h();
                long j = this.d;
                if (zH) {
                    fdaVar = fdaVar3;
                    boolean z2 = fdaVar3.a.e != j;
                    fdaVar2 = b92Var4.c;
                    vg4 vg4Var2 = b92Var4.b;
                    if (fdaVar2.a.o().h()) {
                        b92Var = b92Var3;
                        boolean z3 = fdaVar2.a.e != j;
                        b92Var3 = b92Var;
                        vg4Var = b92Var3.b;
                        if (vg4Var == null && vg4Var2 != null && vg4Var.v() == vg4Var2.v()) {
                            i3 = i4;
                        } else {
                            rt2Var = b92Var3.a;
                            if (rt2Var != null || (rt2Var2 = b92Var4.a) == null) {
                                i3 = i4;
                            } else {
                                i3 = i4;
                                if (rt2Var.a == rt2Var2.a) {
                                }
                            }
                            z = true;
                            if (z || i3 == 0) {
                                b92Var2 = (b92) arrayList3.get(0);
                                arrayList2.add(0, b92Var2);
                                if (arrayList3.size() > 1) {
                                    b92Var2.d = new ArrayList(arrayList3.subList(1, arrayList3.size()));
                                }
                                arrayList3.clear();
                                if (i3 == 0 || !z) {
                                    arrayList3.add(b92Var3);
                                } else {
                                    arrayList2.add(0, b92Var3);
                                }
                            }
                        }
                        if (fdaVar.a.c - fdaVar2.a.c > this.a || arrayList3.size() >= this.c || z2 != z3) {
                            z = true;
                        } else {
                            arrayList3.add(0, b92Var3);
                        }
                        if (z) {
                            b92Var2 = (b92) arrayList3.get(0);
                            arrayList2.add(0, b92Var2);
                            if (arrayList3.size() > 1) {
                                b92Var2.d = new ArrayList(arrayList3.subList(1, arrayList3.size()));
                            }
                            arrayList3.clear();
                            if (i3 == 0) {
                                arrayList3.add(b92Var3);
                            } else {
                                arrayList3.add(b92Var3);
                            }
                        } else {
                            b92Var2 = (b92) arrayList3.get(0);
                            arrayList2.add(0, b92Var2);
                            if (arrayList3.size() > 1) {
                                b92Var2.d = new ArrayList(arrayList3.subList(1, arrayList3.size()));
                            }
                            arrayList3.clear();
                            if (i3 == 0) {
                                arrayList3.add(b92Var3);
                            } else {
                                arrayList3.add(b92Var3);
                            }
                        }
                    } else {
                        b92Var = b92Var3;
                    }
                    b92Var3 = b92Var;
                    vg4Var = b92Var3.b;
                    if (vg4Var == null) {
                        rt2Var = b92Var3.a;
                        if (rt2Var != null) {
                            i3 = i4;
                        } else {
                            i3 = i4;
                        }
                    } else {
                        rt2Var = b92Var3.a;
                        if (rt2Var != null) {
                            i3 = i4;
                        } else {
                            i3 = i4;
                        }
                    }
                    z = true;
                    if (z) {
                        b92Var2 = (b92) arrayList3.get(0);
                        arrayList2.add(0, b92Var2);
                        if (arrayList3.size() > 1) {
                            b92Var2.d = new ArrayList(arrayList3.subList(1, arrayList3.size()));
                        }
                        arrayList3.clear();
                        if (i3 == 0) {
                            arrayList3.add(b92Var3);
                        } else {
                            arrayList3.add(b92Var3);
                        }
                    } else {
                        b92Var2 = (b92) arrayList3.get(0);
                        arrayList2.add(0, b92Var2);
                        if (arrayList3.size() > 1) {
                            b92Var2.d = new ArrayList(arrayList3.subList(1, arrayList3.size()));
                        }
                        arrayList3.clear();
                        if (i3 == 0) {
                            arrayList3.add(b92Var3);
                        } else {
                            arrayList3.add(b92Var3);
                        }
                    }
                } else {
                    fdaVar = fdaVar3;
                }
                fdaVar2 = b92Var4.c;
                vg4 vg4Var3 = b92Var4.b;
                if (fdaVar2.a.o().h()) {
                    b92Var = b92Var3;
                    if (fdaVar2.a.e != j) {
                    }
                    b92Var3 = b92Var;
                    vg4Var = b92Var3.b;
                    if (vg4Var == null) {
                        rt2Var = b92Var3.a;
                        if (rt2Var != null) {
                            i3 = i4;
                        } else {
                            i3 = i4;
                        }
                    } else {
                        rt2Var = b92Var3.a;
                        if (rt2Var != null) {
                            i3 = i4;
                        } else {
                            i3 = i4;
                        }
                    }
                    z = true;
                    if (z) {
                        b92Var2 = (b92) arrayList3.get(0);
                        arrayList2.add(0, b92Var2);
                        if (arrayList3.size() > 1) {
                            b92Var2.d = new ArrayList(arrayList3.subList(1, arrayList3.size()));
                        }
                        arrayList3.clear();
                        if (i3 == 0) {
                            arrayList3.add(b92Var3);
                        } else {
                            arrayList3.add(b92Var3);
                        }
                    } else {
                        b92Var2 = (b92) arrayList3.get(0);
                        arrayList2.add(0, b92Var2);
                        if (arrayList3.size() > 1) {
                            b92Var2.d = new ArrayList(arrayList3.subList(1, arrayList3.size()));
                        }
                        arrayList3.clear();
                        if (i3 == 0) {
                            arrayList3.add(b92Var3);
                        } else {
                            arrayList3.add(b92Var3);
                        }
                    }
                } else {
                    b92Var = b92Var3;
                }
                b92Var3 = b92Var;
                vg4Var = b92Var3.b;
                if (vg4Var == null) {
                    rt2Var = b92Var3.a;
                    if (rt2Var != null) {
                        i3 = i4;
                    } else {
                        i3 = i4;
                    }
                } else {
                    rt2Var = b92Var3.a;
                    if (rt2Var != null) {
                        i3 = i4;
                    } else {
                        i3 = i4;
                    }
                }
                z = true;
                if (z) {
                    b92Var2 = (b92) arrayList3.get(0);
                    arrayList2.add(0, b92Var2);
                    if (arrayList3.size() > 1) {
                        b92Var2.d = new ArrayList(arrayList3.subList(1, arrayList3.size()));
                    }
                    arrayList3.clear();
                    if (i3 == 0) {
                        arrayList3.add(b92Var3);
                    } else {
                        arrayList3.add(b92Var3);
                    }
                } else {
                    b92Var2 = (b92) arrayList3.get(0);
                    arrayList2.add(0, b92Var2);
                    if (arrayList3.size() > 1) {
                        b92Var2.d = new ArrayList(arrayList3.subList(1, arrayList3.size()));
                    }
                    arrayList3.clear();
                    if (i3 == 0) {
                        arrayList3.add(b92Var3);
                    } else {
                        arrayList3.add(b92Var3);
                    }
                }
            }
            z = false;
            if (z) {
                b92Var2 = (b92) arrayList3.get(0);
                arrayList2.add(0, b92Var2);
                if (arrayList3.size() > 1) {
                    b92Var2.d = new ArrayList(arrayList3.subList(1, arrayList3.size()));
                }
                arrayList3.clear();
                if (i3 == 0) {
                    arrayList3.add(b92Var3);
                } else {
                    arrayList3.add(b92Var3);
                }
            } else {
                b92Var2 = (b92) arrayList3.get(0);
                arrayList2.add(0, b92Var2);
                if (arrayList3.size() > 1) {
                    b92Var2.d = new ArrayList(arrayList3.subList(1, arrayList3.size()));
                }
                arrayList3.clear();
                if (i3 == 0) {
                    arrayList3.add(b92Var3);
                } else {
                    arrayList3.add(b92Var3);
                }
            }
        }
        arrayList.subList(i, i2 + 1).clear();
        arrayList.addAll(i, arrayList2);
    }

    public void c(long j) {
        this.a = j;
    }

    public void d(mg5 mg5Var) {
        this.e = mg5Var;
    }

    public void e(long j) {
        this.b.add(Long.valueOf(j));
    }

    public c92() {
        this.b = new ArrayList();
        this.c = -1L;
        this.d = -1L;
    }
}
