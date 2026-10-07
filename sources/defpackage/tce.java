package defpackage;

import android.animation.AnimatorSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.WeakHashMap;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class tce extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ RecordControlsWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tce(int i, lq4 lq4Var, RecordControlsWidget recordControlsWidget) {
        super(2, lq4Var);
        this.e = i;
        this.g = recordControlsWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        RecordControlsWidget recordControlsWidget = this.g;
        switch (i) {
            case 0:
                tce tceVar = new tce(0, lq4Var, recordControlsWidget);
                tceVar.f = obj;
                return tceVar;
            case 1:
                tce tceVar2 = new tce(1, lq4Var, recordControlsWidget);
                tceVar2.f = obj;
                return tceVar2;
            case 2:
                tce tceVar3 = new tce(2, lq4Var, recordControlsWidget);
                tceVar3.f = obj;
                return tceVar3;
            default:
                tce tceVar4 = new tce(3, lq4Var, recordControlsWidget);
                tceVar4.f = obj;
                return tceVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((tce) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((tce) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((tce) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((tce) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        AnimatorSet animatorSet;
        ylc ylcVar;
        int i = this.e;
        boolean z = false;
        sbi sbiVar = sbi.a;
        RecordControlsWidget recordControlsWidget = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = RecordControlsWidget.x1;
                View viewF1 = recordControlsWidget.F1();
                gb3 gb3Var = new gb3((dce) obj2, 4, recordControlsWidget);
                if (viewF1.isLaidOut()) {
                    gb3Var.invoke();
                } else {
                    WeakHashMap weakHashMap = i7j.a;
                    if (!viewF1.isLaidOut() || viewF1.isLayoutRequested()) {
                        viewF1.addOnLayoutChangeListener(new xc0(17, gb3Var));
                    } else {
                        gb3Var.invoke();
                    }
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                String str = (String) obj2;
                ycj ycjVar = recordControlsWidget.v;
                if (ycjVar != null) {
                    ycjVar.setDurationText(str);
                }
                recordControlsWidget.y1().setText(str);
                return sbiVar;
            case 2:
                ch3.d0(obj);
                MotionEvent motionEvent = (MotionEvent) obj2;
                ny8 ny8Var = recordControlsWidget.D;
                zv8[] zv8VarArr2 = RecordControlsWidget.x1;
                dce dceVar = (dce) recordControlsWidget.I1().s.a.getValue();
                if (recordControlsWidget.u1().getX() != 0.0f && !(dceVar instanceof cce) && (((animatorSet = recordControlsWidget.t1) == null || !animatorSet.isRunning()) && (ylcVar = recordControlsWidget.H) != null)) {
                    Float f = (Float) ylcVar.a;
                    Float f2 = (Float) ylcVar.b;
                    if (motionEvent.getAction() == 2 && f != null && f2 != null) {
                        if (!recordControlsWidget.o1) {
                            recordControlsWidget.Z = motionEvent.getRawX() - recordControlsWidget.u1().getX();
                            recordControlsWidget.n1 = motionEvent.getRawY() - recordControlsWidget.u1().getY();
                            recordControlsWidget.o1 = true;
                        }
                        float rawX = motionEvent.getRawX() - recordControlsWidget.Z;
                        float rawY = motionEvent.getRawY() - recordControlsWidget.n1;
                        float fFloatValue = rawX - f.floatValue();
                        float fFloatValue2 = rawY - f2.floatValue();
                        double degrees = Math.toDegrees((float) Math.atan2(-fFloatValue2, fFloatValue));
                        if (degrees < 0.0d) {
                            degrees += 360.0d;
                        }
                        int iJ = gm0.J(Math.ceil(degrees));
                        if (RecordControlsWidget.y1.c(iJ)) {
                            recordControlsWidget.K = 0.0f;
                            recordControlsWidget.J = oc9.u(fFloatValue2 / (-gm0.K(yl5.d().getDisplayMetrics().density * 40.0f)), 0.0f, 1.0f) * 100.0f;
                            ((x96) ny8Var.getValue()).a((recordControlsWidget.J / 100.0f) * 0.7f);
                            if (recordControlsWidget.J >= 100.0f) {
                                recordControlsWidget.J = 100.0f;
                                recordControlsWidget.I1().S();
                                View view = recordControlsWidget.getView();
                                if (view != null) {
                                    p0m.a(view, lt7.CONFIRM);
                                }
                            } else {
                                float fFloatValue3 = f2.floatValue() - rawY;
                                float fK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                                AnimatorSet animatorSet2 = recordControlsWidget.v1;
                                if (fFloatValue3 > fK) {
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                    }
                                } else if (animatorSet2 != null) {
                                    animatorSet2.start();
                                }
                                View viewA1 = recordControlsWidget.A1();
                                ylc ylcVar2 = recordControlsWidget.I;
                                viewA1.setTranslationX(ylcVar2 != null ? ((Number) ylcVar2.a).floatValue() : 0.0f);
                                View viewA2 = recordControlsWidget.A1();
                                ylc ylcVar3 = recordControlsWidget.I;
                                viewA2.setTranslationY(recordControlsWidget.u1().getTranslationY() + (ylcVar3 != null ? ((Number) ylcVar3.b).floatValue() : 0.0f));
                                recordControlsWidget.u1().setX(f.floatValue());
                                recordControlsWidget.u1().setY(rawY);
                            }
                        } else if (RecordControlsWidget.z1.c(iJ)) {
                            recordControlsWidget.J = 0.0f;
                            ((x96) ny8Var.getValue()).a(0.0f);
                            float fU = oc9.u((rawX - (f.floatValue() - gm0.K(yl5.d().getDisplayMetrics().density * 40.0f))) / ((f.floatValue() - gm0.K(90.0f * yl5.d().getDisplayMetrics().density)) - f.floatValue()), 0.0f, 1.0f) * 100.0f;
                            recordControlsWidget.K = fU;
                            if (fU >= 100.0f) {
                                jce jceVarI1 = recordControlsWidget.I1();
                                jceVarI1.G().f();
                                jceVarI1.D();
                                mjg mjgVar = jceVarI1.r;
                                cce cceVar = new cce(false, 1);
                                mjgVar.getClass();
                                mjgVar.j(null, cceVar);
                            } else {
                                float fFloatValue4 = f.floatValue() - rawX;
                                float fK2 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
                                AnimatorSet animatorSet3 = recordControlsWidget.u1;
                                if (fFloatValue4 > fK2) {
                                    if (animatorSet3 != null) {
                                        animatorSet3.cancel();
                                    }
                                    AnimatorSet animatorSet4 = recordControlsWidget.v1;
                                    if (animatorSet4 != null) {
                                        animatorSet4.cancel();
                                    }
                                } else {
                                    if (animatorSet3 != null) {
                                        animatorSet3.start();
                                    }
                                    AnimatorSet animatorSet5 = recordControlsWidget.v1;
                                    if (animatorSet5 != null) {
                                        animatorSet5.start();
                                    }
                                }
                                float fD = (((recordControlsWidget.K / 100.0f) * zo5.D(124.0f, yl5.d().getDisplayMetrics().density, gm0.K(36.0f * yl5.d().getDisplayMetrics().density))) + gm0.K(yl5.d().getDisplayMetrics().density * 124.0f)) / gm0.K(124.0f * yl5.d().getDisplayMetrics().density);
                                recordControlsWidget.u1().setScaleX(fD);
                                recordControlsWidget.u1().setScaleY(fD);
                                float fU2 = oc9.u(tqk.b(f.floatValue() - gm0.K(20.0f * yl5.d().getDisplayMetrics().density), f.floatValue() - gm0.K(40.0f * yl5.d().getDisplayMetrics().density), rawX), 0.0f, 1.0f);
                                float fK3 = gm0.K((-20.0f) * yl5.d().getDisplayMetrics().density) * fU2;
                                recordControlsWidget.w1().setAlpha(1.0f - fU2);
                                recordControlsWidget.w1().setTranslationX(fK3);
                                recordControlsWidget.u1().setX(rawX);
                                recordControlsWidget.u1().setY(f2.floatValue());
                                ifg ifgVar = recordControlsWidget.p1;
                                if (ifgVar != null) {
                                    ifgVar.a(rawX + (recordControlsWidget.u1().getWidth() / 2) + (-recordControlsWidget.F1().getWidth()) + (gm0.K(40.0f * yl5.d().getDisplayMetrics().density) / 2));
                                }
                                View viewA3 = recordControlsWidget.A1();
                                ylc ylcVar4 = recordControlsWidget.I;
                                viewA3.setTranslationY(ylcVar4 != null ? ((Number) ylcVar4.b).floatValue() : 0.0f);
                            }
                        }
                    }
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                jbe jbeVar = (jbe) obj2;
                if (cqk.d(jbeVar, gbe.a)) {
                    zv8[] zv8VarArr3 = RecordControlsWidget.x1;
                    jce jceVarI2 = recordControlsWidget.I1();
                    dce dceVar2 = (dce) jceVarI2.r.getValue();
                    if (dceVar2 instanceof ybe) {
                        gm0.Y(jce.class.getName(), "Early return in closeLockedControls cuz of currentState is RecordState.Finalizing");
                    } else {
                        if (dceVar2 instanceof bce) {
                            jceVarI2.T();
                        }
                        a8j.x(jceVarI2.v, tbe.a);
                    }
                } else {
                    boolean zD = cqk.d(jbeVar, ibe.a);
                    fbe fbeVar = fbe.a;
                    if (zD) {
                        zv8[] zv8VarArr4 = RecordControlsWidget.x1;
                        dce dceVar3 = (dce) recordControlsWidget.I1().s.a.getValue();
                        if (dceVar3 != null && !(dceVar3 instanceof ybe) && !(dceVar3 instanceof cce)) {
                            z = true;
                        }
                        if (recordControlsWidget.H1() == fbeVar && z) {
                            recordControlsWidget.I1().P();
                        }
                    } else {
                        if (!cqk.d(jbeVar, hbe.a)) {
                            ore.o();
                            return null;
                        }
                        zv8[] zv8VarArr5 = RecordControlsWidget.x1;
                        if (recordControlsWidget.H1() == fbeVar) {
                            jce jceVarI3 = recordControlsWidget.I1();
                            mjg mjgVar2 = jceVarI3.r;
                            if ((mjgVar2.getValue() instanceof bce) || (mjgVar2.getValue() instanceof zbe)) {
                                mjgVar2.j(null, new ace(jceVarI3.N(), true));
                            } else {
                                gm0.Y(jce.class.getName(), "Early return in pauseWithoutResume cuz of _state.value !is RecordState.Recording && _state.value !is RecordState.Pause");
                            }
                        }
                    }
                }
                return sbiVar;
        }
    }
}
