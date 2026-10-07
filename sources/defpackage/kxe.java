package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class kxe extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public lxe f;
    public lxe g;
    public int h;
    public final /* synthetic */ lxe i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kxe(lxe lxeVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = lxeVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        lxe lxeVar = this.i;
        switch (i) {
            case 0:
                return new kxe(lxeVar, lq4Var, 0);
            default:
                return new kxe(lxeVar, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((kxe) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        lxe lxeVar;
        lxe lxeVar2;
        String string;
        lxe lxeVar3 = "call to 'resume' before 'invoke' with coroutine";
        switch (this.e) {
            case 0:
                hu4 hu4Var = hu4.a;
                int i = this.h;
                try {
                    if (i == 0) {
                        ch3.d0(obj);
                        lxe lxeVar4 = this.i;
                        ljh ljhVar = (ljh) lxeVar4.j.getValue();
                        this.f = lxeVar4;
                        this.g = lxeVar4;
                        this.h = 1;
                        obj = upl.b(ljhVar, this);
                        if (obj == hu4Var) {
                            return hu4Var;
                        }
                        lxeVar = lxeVar4;
                        lxeVar3 = lxeVar4;
                    } else {
                        if (i != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        lxe lxeVar5 = this.g;
                        lxe lxeVar6 = this.f;
                        ch3.d0(obj);
                        lxeVar3 = lxeVar5;
                        lxeVar = lxeVar6;
                    }
                    go6 go6Var = (go6) obj;
                    lxeVar.i.set(go6Var);
                    String str = lxeVar.f;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.e;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "availabilityResult = " + go6Var, null);
                        }
                        break;
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    boolean zBooleanValue = ((Boolean) ((e5d) lxeVar3.b.getValue()).p().i()).booleanValue();
                    String str2 = lxeVar3.f;
                    if (zBooleanValue) {
                        gm0.V(str2, "fail to check push availability", new mxe(th, "fail to check push availability"));
                    } else {
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9 je9Var2 = je9.f;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, str2, "fail to check push availability", th);
                            }
                        }
                    }
                }
                return sbi.a;
            default:
                hu4 hu4Var2 = hu4.a;
                int i2 = this.h;
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        lxe lxeVar7 = this.i;
                        ljh ljhVar2 = (ljh) lxeVar7.h.getValue();
                        this.f = lxeVar7;
                        this.g = lxeVar7;
                        this.h = 1;
                        obj = upl.b(ljhVar2, this);
                        if (obj == hu4Var2) {
                            return hu4Var2;
                        }
                        lxeVar2 = lxeVar7;
                        lxeVar3 = lxeVar7;
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        lxe lxeVar8 = this.g;
                        lxe lxeVar9 = this.f;
                        ch3.d0(obj);
                        lxeVar3 = lxeVar8;
                        lxeVar2 = lxeVar9;
                    }
                    Object obj2 = (String) obj;
                    lxeVar2.g.set(obj2);
                    String str3 = lxeVar2.f;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null) {
                        je9 je9Var3 = je9.e;
                        if (a4cVar3.b(je9Var3)) {
                            if (obj2 == null) {
                                string = null;
                            } else if (gm0.c()) {
                                string = obj2.toString();
                            } else if (obj2 instanceof Collection) {
                                string = ((Collection) obj2).isEmpty() ? "[]" : "[**" + ((Collection) obj2).size() + "**]";
                            } else if (obj2 instanceof Map) {
                                string = ((Map) obj2).isEmpty() ? "{}" : "{**" + ((Map) obj2).size() + "**}";
                            } else if (obj2 instanceof Object[]) {
                                if (((Object[]) obj2).length != 0) {
                                    string = "[**" + ((Object[]) obj2).length + "**]";
                                }
                            } else if (obj2 instanceof int[]) {
                                if (((int[]) obj2).length != 0) {
                                    string = "[**" + ((int[]) obj2).length + "**]";
                                }
                            } else if (obj2 instanceof float[]) {
                                if (((float[]) obj2).length != 0) {
                                    string = "[**" + ((float[]) obj2).length + "**]";
                                }
                            } else if (obj2 instanceof long[]) {
                                if (((long[]) obj2).length != 0) {
                                    string = "[**" + ((long[]) obj2).length + "**]";
                                }
                            } else if (obj2 instanceof double[]) {
                                if (((double[]) obj2).length != 0) {
                                    string = "[**" + ((double[]) obj2).length + "**]";
                                }
                            } else if (obj2 instanceof short[]) {
                                if (((short[]) obj2).length != 0) {
                                    string = "[**" + ((short[]) obj2).length + "**]";
                                }
                            } else if (obj2 instanceof byte[]) {
                                if (((byte[]) obj2).length != 0) {
                                    string = "[**" + ((byte[]) obj2).length + "**]";
                                }
                            } else if (obj2 instanceof char[]) {
                                if (((char[]) obj2).length != 0) {
                                    string = "[**" + ((char[]) obj2).length + "**]";
                                }
                            } else if (!(obj2 instanceof boolean[])) {
                                string = "***";
                            } else if (((boolean[]) obj2).length != 0) {
                                string = "[**" + ((boolean[]) obj2).length + "**]";
                            }
                            a4cVar3.c(je9Var3, str3, "pushToken = " + string, null);
                        }
                        break;
                    }
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    boolean zBooleanValue2 = ((Boolean) ((e5d) lxeVar3.b.getValue()).p().i()).booleanValue();
                    String str4 = lxeVar3.f;
                    if (zBooleanValue2) {
                        gm0.V(str4, "fail to fetch push token", new mxe(th2, "fail to fetch push token"));
                    } else {
                        a4c a4cVar4 = gm0.f;
                        if (a4cVar4 != null) {
                            je9 je9Var4 = je9.f;
                            if (a4cVar4.b(je9Var4)) {
                                a4cVar4.c(je9Var4, str4, "fail to fetch push token", th2);
                            }
                        }
                    }
                }
                return sbi.a;
        }
    }
}
