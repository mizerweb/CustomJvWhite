package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cy0 extends sg5 {
    public final /* synthetic */ int c;
    public final boolean d;
    public final Object e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy0(dy0 dy0Var, lq0 lq0Var, ay0 ay0Var, boolean z) {
        super(lq0Var);
        this.c = 0;
        this.f = dy0Var;
        this.e = ay0Var;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0 A[Catch: all -> 0x00a9, TryCatch #4 {all -> 0x00a9, blocks: (B:24:0x0043, B:27:0x004e, B:32:0x0057, B:35:0x0061, B:43:0x0079, B:46:0x0086, B:48:0x008f, B:51:0x0097, B:52:0x009a, B:54:0x009c, B:55:0x009f, B:41:0x0075, B:42:0x0078, B:56:0x00a0, B:57:0x00a4, B:38:0x006b, B:47:0x0089, B:45:0x007e), top: B:115:0x0043, inners: #0, #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4 A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #4 {all -> 0x00a9, blocks: (B:24:0x0043, B:27:0x004e, B:32:0x0057, B:35:0x0061, B:43:0x0079, B:46:0x0086, B:48:0x008f, B:51:0x0097, B:52:0x009a, B:54:0x009c, B:55:0x009f, B:41:0x0075, B:42:0x0078, B:56:0x00a0, B:57:0x00a4, B:38:0x006b, B:47:0x0089, B:45:0x007e), top: B:115:0x0043, inners: #0, #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x011e A[Catch: all -> 0x013d, TRY_LEAVE, TryCatch #7 {all -> 0x013d, blocks: (B:64:0x00b6, B:67:0x00c1, B:69:0x00c9, B:71:0x00d5, B:75:0x00e0, B:82:0x010c, B:85:0x0113, B:87:0x0118, B:88:0x011b, B:90:0x011e, B:98:0x0130, B:99:0x0134, B:100:0x0137, B:101:0x0138, B:77:0x00e6, B:79:0x0101, B:84:0x0110, B:92:0x0124, B:97:0x012d), top: B:120:0x00b6, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x012c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.lq0
    public final void h(int i, Object obj) {
        au3 au3Var;
        int i2 = this.c;
        Object obj2 = this.e;
        Object obj3 = this.f;
        boolean z = this.d;
        lq0 lq0Var = this.b;
        au3 au3VarB = null;
        switch (i2) {
            case 0:
                au3 au3Var2 = (au3) obj;
                ay0 ay0Var = (ay0) obj2;
                taa taaVar = ((dy0) obj3).b;
                try {
                    qe7.v();
                    boolean zA = lq0.a(i);
                    if (au3Var2 == null) {
                        if (zA) {
                            lq0Var.g(i, null);
                        }
                    } else if (((xt3) au3Var2.K()).isStateful() || lq0.l(i, 8)) {
                        lq0Var.g(i, au3Var2);
                    } else if (zA || (au3Var = taaVar.get(ay0Var)) == null) {
                        au3VarB = z ? taaVar.b(ay0Var, au3Var2) : null;
                        if (zA) {
                            try {
                                lq0Var.i(1.0f);
                            } catch (Throwable th) {
                                au3.E(au3VarB);
                                throw th;
                            }
                        }
                        if (au3VarB != null) {
                            au3Var2 = au3VarB;
                        }
                        lq0Var.g(i, au3Var2);
                        au3.E(au3VarB);
                    } else {
                        try {
                            i1e qualityInfo = ((xt3) au3Var2.K()).getQualityInfo();
                            i1e qualityInfo2 = ((xt3) au3Var.K()).getQualityInfo();
                            if (((s98) qualityInfo2).c || ((s98) qualityInfo2).a >= ((s98) qualityInfo).a) {
                                lq0Var.g(i, au3Var);
                                au3Var.close();
                            } else {
                                au3Var.close();
                                if (z) {
                                }
                                if (zA) {
                                    lq0Var.i(1.0f);
                                }
                                if (au3VarB != null) {
                                    au3Var2 = au3VarB;
                                }
                                lq0Var.g(i, au3Var2);
                                au3.E(au3VarB);
                            }
                        } catch (Throwable th2) {
                            au3Var.close();
                            throw th2;
                        }
                    }
                    qe7.v();
                    return;
                } catch (Throwable th3) {
                    qe7.v();
                    throw th3;
                }
            case 1:
                p76 p76Var = (p76) obj;
                try {
                    qe7.v();
                    if (!lq0.b(i) && p76Var != null) {
                        if ((i & 10) != 0) {
                            lq0Var.g(i, p76Var);
                        } else {
                            p76Var.Y();
                            if (p76Var.b == i68.c) {
                                lq0Var.g(i, p76Var);
                            } else {
                                au3 au3VarA = au3.A(p76Var.a);
                                if (au3VarA == null) {
                                    lq0Var.g(i, p76Var);
                                } else {
                                    if (z) {
                                        try {
                                            au3VarB = ((taa) obj2).b((l6g) obj3, au3VarA);
                                        } catch (Throwable th4) {
                                            au3VarA.close();
                                            throw th4;
                                        }
                                    }
                                    au3VarA.close();
                                    if (au3VarB != null) {
                                        try {
                                            p76 p76Var2 = new p76(au3VarB);
                                            p76Var2.l(p76Var);
                                            au3VarB.close();
                                            try {
                                                lq0Var.i(1.0f);
                                                lq0Var.g(i, p76Var2);
                                                p76Var2.close();
                                            } catch (Throwable th5) {
                                                p76Var2.close();
                                                throw th5;
                                            }
                                        } catch (Throwable th6) {
                                            au3VarB.close();
                                            throw th6;
                                        }
                                    } else {
                                        lq0Var.g(i, p76Var);
                                    }
                                }
                            }
                        }
                        break;
                    } else {
                        lq0Var.g(i, p76Var);
                    }
                    qe7.v();
                    return;
                } catch (Throwable th7) {
                    qe7.v();
                    throw th7;
                }
            default:
                au3 au3Var3 = (au3) obj;
                if (au3Var3 == null) {
                    if (lq0.a(i)) {
                        lq0Var.g(i, null);
                        return;
                    }
                    return;
                } else {
                    if (lq0.b(i)) {
                        return;
                    }
                    au3VarB = z ? ((taa) obj3).b((ay0) obj2, au3Var3) : null;
                    try {
                        lq0Var.i(1.0f);
                        if (au3VarB != null) {
                            au3Var3 = au3VarB;
                        }
                        lq0Var.g(i, au3Var3);
                        return;
                    } finally {
                        au3.E(au3VarB);
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy0(lq0 lq0Var, Object obj, Object obj2, boolean z, int i) {
        super(lq0Var);
        this.c = i;
        this.e = obj;
        this.f = obj2;
        this.d = z;
    }
}
