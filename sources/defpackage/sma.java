package defpackage;

import android.os.Parcelable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.multiselectbottomwidget.MultiSelectBottomWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.messages.scheduled.widget.ScheduledSendPickerBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class sma extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ MessageWriteWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sma(lq4 lq4Var, MessageWriteWidget messageWriteWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = messageWriteWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        MessageWriteWidget messageWriteWidget = this.g;
        switch (i) {
            case 0:
                sma smaVar = new sma(lq4Var, messageWriteWidget, 0);
                smaVar.f = obj;
                return smaVar;
            case 1:
                sma smaVar2 = new sma(lq4Var, messageWriteWidget, 1);
                smaVar2.f = obj;
                return smaVar2;
            case 2:
                sma smaVar3 = new sma(lq4Var, messageWriteWidget, 2);
                smaVar3.f = obj;
                return smaVar3;
            case 3:
                sma smaVar4 = new sma(lq4Var, messageWriteWidget, 3);
                smaVar4.f = obj;
                return smaVar4;
            case 4:
                sma smaVar5 = new sma(lq4Var, messageWriteWidget, 4);
                smaVar5.f = obj;
                return smaVar5;
            case 5:
                sma smaVar6 = new sma(lq4Var, messageWriteWidget, 5);
                smaVar6.f = obj;
                return smaVar6;
            case 6:
                sma smaVar7 = new sma(lq4Var, messageWriteWidget, 6);
                smaVar7.f = obj;
                return smaVar7;
            case 7:
                sma smaVar8 = new sma(lq4Var, messageWriteWidget, 7);
                smaVar8.f = obj;
                return smaVar8;
            case 8:
                sma smaVar9 = new sma(lq4Var, messageWriteWidget, 8);
                smaVar9.f = obj;
                return smaVar9;
            case 9:
                sma smaVar10 = new sma(lq4Var, messageWriteWidget, 9);
                smaVar10.f = obj;
                return smaVar10;
            case 10:
                sma smaVar11 = new sma(lq4Var, messageWriteWidget, 10);
                smaVar11.f = obj;
                return smaVar11;
            case 11:
                sma smaVar12 = new sma(lq4Var, messageWriteWidget, 11);
                smaVar12.f = obj;
                return smaVar12;
            case 12:
                sma smaVar13 = new sma(lq4Var, messageWriteWidget, 12);
                smaVar13.f = obj;
                return smaVar13;
            case 13:
                sma smaVar14 = new sma(lq4Var, messageWriteWidget, 13);
                smaVar14.f = obj;
                return smaVar14;
            case 14:
                sma smaVar15 = new sma(lq4Var, messageWriteWidget, 14);
                smaVar15.f = obj;
                return smaVar15;
            case 15:
                sma smaVar16 = new sma(lq4Var, messageWriteWidget, 15);
                smaVar16.f = obj;
                return smaVar16;
            case 16:
                sma smaVar17 = new sma(lq4Var, messageWriteWidget, 16);
                smaVar17.f = obj;
                return smaVar17;
            case 17:
                sma smaVar18 = new sma(lq4Var, messageWriteWidget, 17);
                smaVar18.f = obj;
                return smaVar18;
            case 18:
                sma smaVar19 = new sma(lq4Var, messageWriteWidget, 18);
                smaVar19.f = obj;
                return smaVar19;
            case 19:
                sma smaVar20 = new sma(lq4Var, messageWriteWidget, 19);
                smaVar20.f = obj;
                return smaVar20;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                sma smaVar21 = new sma(lq4Var, messageWriteWidget, 20);
                smaVar21.f = obj;
                return smaVar21;
            default:
                sma smaVar22 = new sma(lq4Var, messageWriteWidget, 21);
                smaVar22.f = obj;
                return smaVar22;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 7:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 8:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 9:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 10:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 11:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 12:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 13:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 14:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 15:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 16:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 17:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 18:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 19:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((sma) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0510  */
    /* JADX WARN: Code duplicated, block: B:203:0x0602  */
    /* JADX WARN: Code duplicated, block: B:205:0x0608 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:206:0x060a  */
    /* JADX WARN: Code duplicated, block: B:207:0x0613  */
    /* JADX WARN: Code duplicated, block: B:208:0x0618  */
    /* JADX WARN: Code duplicated, block: B:211:0x0624  */
    /* JADX WARN: Code duplicated, block: B:213:0x063e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0644  */
    /* JADX WARN: Code duplicated, block: B:217:0x0652  */
    /* JADX WARN: Code duplicated, block: B:218:0x065b  */
    /* JADX WARN: Code duplicated, block: B:220:0x0665  */
    /* JADX WARN: Code duplicated, block: B:221:0x066c  */
    /* JADX WARN: Code duplicated, block: B:222:0x0680  */
    /* JADX WARN: Code duplicated, block: B:224:0x0686  */
    /* JADX WARN: Code duplicated, block: B:226:0x068d  */
    /* JADX WARN: Code duplicated, block: B:228:0x0699  */
    /* JADX WARN: Code duplicated, block: B:235:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:238:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:239:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:241:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:242:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:244:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:258:0x072e  */
    /* JADX WARN: Code duplicated, block: B:260:0x073a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [lq4] */
    /* JADX WARN: Type inference failed for: r12v1, types: [br4] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        View view;
        MultiSelectBottomWidget multiSelectBottomWidget;
        Object value;
        View view2;
        RecordControlsWidget recordControlsWidget;
        int iOrdinal;
        View videoMessageRecordAnchor;
        jce jceVarI1;
        ic6 ic6Var;
        p3c p3cVar;
        qbe qbeVar;
        vo8 vo8Var;
        vo8 vo8Var2;
        vo8 vo8VarL;
        Object value2;
        rt2 rt2Var;
        Editable text;
        int i = this.e;
        int i2 = 5;
        int i3 = 26;
        int i4 = 6;
        eha ehaVar = eha.a;
        int i5 = 3;
        z = false;
        boolean z = false;
        int i6 = 0;
        ?? r12 = 0;
        sbi sbiVar = sbi.a;
        MessageWriteWidget messageWriteWidget = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                MessageWriteWidget.q1(messageWriteWidget, (lla) obj2);
                return sbiVar;
            case 1:
                ch3.d0(obj);
                MessageWriteWidget.o1(messageWriteWidget, (fla) obj2);
                return sbiVar;
            case 2:
                ch3.d0(obj);
                MessageWriteWidget.p1(messageWriteWidget, (hla) obj2);
                return sbiVar;
            case 3:
                ch3.d0(obj);
                zv8[] zv8VarArr = MessageWriteWidget.I;
                n7j.c(messageWriteWidget.t1(), 300L, new ol0(16, messageWriteWidget));
                return sbiVar;
            case 4:
                ch3.d0(obj);
                if (((Boolean) obj2).booleanValue()) {
                    zv8[] zv8VarArr2 = MessageWriteWidget.I;
                    messageWriteWidget.t1().m(messageWriteWidget.D1());
                    messageWriteWidget.y1().d("multi_select_bar_controller_tag", new yma(messageWriteWidget, 0));
                    messageWriteWidget.x1().B(true);
                    mjg mjgVar = messageWriteWidget.x1().i;
                    do {
                        value = mjgVar.getValue();
                        ((Boolean) value).getClass();
                    } while (!mjgVar.h(value, Boolean.FALSE));
                    br4 br4VarC = rx8.C(messageWriteWidget.y1().a);
                    MultiSelectBottomWidget multiSelectBottomWidget2 = br4VarC instanceof MultiSelectBottomWidget ? (MultiSelectBottomWidget) br4VarC : null;
                    if (multiSelectBottomWidget2 != null && (view2 = multiSelectBottomWidget2.getView()) != null) {
                        view2.setVisibility(0);
                    }
                } else {
                    zv8[] zv8VarArr3 = MessageWriteWidget.I;
                    messageWriteWidget.x1().B(false);
                    br4 br4VarC2 = rx8.C(messageWriteWidget.y1().a);
                    if (br4VarC2 instanceof MultiSelectBottomWidget) {
                        multiSelectBottomWidget = (MultiSelectBottomWidget) br4VarC2;
                    }
                    if (r12 != 0 && (view = r12.getView()) != null) {
                        r12 = multiSelectBottomWidget;
                        view.setVisibility(8);
                    }
                    r12 = multiSelectBottomWidget;
                    r12 = multiSelectBottomWidget;
                    if (messageWriteWidget.D1()) {
                        messageWriteWidget.t1().l();
                    }
                }
                return sbiVar;
            case 5:
                ch3.d0(obj);
                mla mlaVar = (mla) obj2;
                zv8[] zv8VarArr4 = MessageWriteWidget.I;
                fbe fbeVar = mlaVar.a;
                MotionEvent motionEvent = mlaVar.b;
                Object objF0 = tre.f0(messageWriteWidget.getArgs(), "arg_scope_id", t3f.class);
                if (objF0 == null) {
                    c.o(c0a.o("No value passed for key arg_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
                    return null;
                }
                if (sol.d((t3f) ((Parcelable) objF0))) {
                    recordControlsWidget = null;
                } else {
                    String strB = messageWriteWidget.y1().b();
                    String strK = qv1.k("record_controls_controller_", fbeVar.name());
                    if (rx8.C(messageWriteWidget.y1().a) == null || !cqk.d(strB, strK)) {
                        Object objF1 = tre.f0(messageWriteWidget.getArgs(), "arg_scope_id", t3f.class);
                        if (objF1 == null) {
                            c.o(c0a.o("No value passed for key arg_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
                            return null;
                        }
                        t3f t3fVar = (t3f) ((Parcelable) objF1);
                        zp3 zp3VarY1 = messageWriteWidget.y1();
                        hve hveVar = zp3VarY1.a;
                        if (!cqk.d(zp3VarY1.b(), strK)) {
                            hveVar.S(false);
                            lve lveVarE = oc9.e(new RecordControlsWidget(t3fVar, fbeVar), null, null);
                            lveVarE.e(strK);
                            hveVar.T(lveVarE);
                        }
                        hve childRouter = messageWriteWidget.getChildRouter((ViewGroup) messageWriteWidget.u.m(messageWriteWidget, MessageWriteWidget.I[5]));
                        childRouter.e = 1;
                        childRouter.S(false);
                        if (!childRouter.o()) {
                            childRouter.T(oc9.e(new RecordControlsWidget(t3fVar, fbeVar), null, null));
                        }
                    }
                    br4 br4VarC3 = rx8.C(messageWriteWidget.y1().a);
                    if (br4VarC3 instanceof RecordControlsWidget) {
                        recordControlsWidget = (RecordControlsWidget) br4VarC3;
                    } else {
                        recordControlsWidget = null;
                    }
                }
                if (recordControlsWidget != null) {
                    if (motionEvent.getAction() != 0) {
                        iOrdinal = fbeVar.ordinal();
                        if (iOrdinal == 0) {
                            videoMessageRecordAnchor = messageWriteWidget.t1().getVideoMessageRecordAnchor();
                        } else {
                            if (iOrdinal != 1) {
                                ore.o();
                                return null;
                            }
                            videoMessageRecordAnchor = messageWriteWidget.t1().getAudioRecordAnchor();
                        }
                        if (videoMessageRecordAnchor != null) {
                            recordControlsWidget.w1 = videoMessageRecordAnchor.getX();
                            jceVarI1 = recordControlsWidget.I1();
                            int i7 = recordControlsWidget.X;
                            ic6Var = jceVarI1.v;
                            p3cVar = jceVarI1.z;
                            qbeVar = jceVarI1.d;
                            if (jceVarI1.r.getValue() == null) {
                                if (motionEvent.getAction() == 0) {
                                    if (((Boolean) jceVarI1.e.invoke()).booleanValue()) {
                                        qbeVar.C(jceVarI1.F(), true);
                                    } else if (jceVarI1.K().g()) {
                                        p3cVar.B(jceVarI1, jce.D[0], yab.i0(jceVarI1.b, null, 2, new ur8(jceVarI1, r12, i3), 1));
                                    } else {
                                        a8j.x(ic6Var, sbe.a);
                                    }
                                } else if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                                    zv8[] zv8VarArr5 = jce.D;
                                    vo8Var = (vo8) p3cVar.m(jceVarI1, zv8VarArr5[0]);
                                    if (vo8Var != null && vo8Var.isActive() && jceVarI1.K().g()) {
                                        a8j.x(qbeVar.e, new obe(jceVarI1.c, new tnh(R.string.audio_record_hold_to_start)));
                                        a8j.x(ic6Var, rbe.a);
                                        jceVarI1.G().d();
                                    }
                                    vo8Var2 = (vo8) p3cVar.m(jceVarI1, zv8VarArr5[0]);
                                    if (vo8Var2 != null) {
                                        vo8Var2.b(null);
                                    }
                                    vo8VarL = jceVarI1.L();
                                    if (vo8VarL != null) {
                                        vo8VarL.b(null);
                                    }
                                }
                            } else if (motionEvent.getAction() == 3) {
                                jceVarI1.E();
                            } else if (motionEvent.getAction() == 1 || jceVarI1.N()) {
                                if ((jceVarI1.s.a.getValue() instanceof bce) && !jceVarI1.N()) {
                                    a8j.x(jceVarI1.w, motionEvent);
                                }
                            } else if (motionEvent.getRawY() < i7) {
                                jceVarI1.S();
                            } else if (jceVarI1.O()) {
                                jceVarI1.E();
                                jceVarI1.V();
                            } else {
                                jce.W(jceVarI1, 3);
                                vo8 vo8Var3 = (vo8) p3cVar.m(jceVarI1, jce.D[0]);
                                if (vo8Var3 != null) {
                                    vo8Var3.b(null);
                                }
                                vo8 vo8VarL2 = jceVarI1.L();
                                if (vo8VarL2 != null) {
                                    vo8VarL2.b(null);
                                }
                            }
                        }
                    } else {
                        int iOrdinal2 = fbeVar.ordinal();
                        if (iOrdinal2 == 0) {
                            wsc wscVarV1 = messageWriteWidget.v1();
                            String[] strArr = wsc.r;
                            if (wscVarV1.c(strArr)) {
                                iOrdinal = fbeVar.ordinal();
                                if (iOrdinal == 0) {
                                    videoMessageRecordAnchor = messageWriteWidget.t1().getVideoMessageRecordAnchor();
                                } else {
                                    if (iOrdinal != 1) {
                                        ore.o();
                                        return null;
                                    }
                                    videoMessageRecordAnchor = messageWriteWidget.t1().getAudioRecordAnchor();
                                }
                                if (videoMessageRecordAnchor != null) {
                                    recordControlsWidget.w1 = videoMessageRecordAnchor.getX();
                                    jceVarI1 = recordControlsWidget.I1();
                                    int i8 = recordControlsWidget.X;
                                    ic6Var = jceVarI1.v;
                                    p3cVar = jceVarI1.z;
                                    qbeVar = jceVarI1.d;
                                    if (jceVarI1.r.getValue() == null) {
                                        if (motionEvent.getAction() == 0) {
                                            if (((Boolean) jceVarI1.e.invoke()).booleanValue()) {
                                                qbeVar.C(jceVarI1.F(), true);
                                            } else if (jceVarI1.K().g()) {
                                                a8j.x(ic6Var, sbe.a);
                                            } else {
                                                p3cVar.B(jceVarI1, jce.D[0], yab.i0(jceVarI1.b, null, 2, new ur8(jceVarI1, r12, i3), 1));
                                            }
                                        } else if (motionEvent.getAction() != 1) {
                                            zv8[] zv8VarArr6 = jce.D;
                                            vo8Var = (vo8) p3cVar.m(jceVarI1, zv8VarArr6[0]);
                                            if (vo8Var != null) {
                                                a8j.x(qbeVar.e, new obe(jceVarI1.c, new tnh(R.string.audio_record_hold_to_start)));
                                                a8j.x(ic6Var, rbe.a);
                                                jceVarI1.G().d();
                                            }
                                            vo8Var2 = (vo8) p3cVar.m(jceVarI1, zv8VarArr6[0]);
                                            if (vo8Var2 != null) {
                                                vo8Var2.b(null);
                                            }
                                            vo8VarL = jceVarI1.L();
                                            if (vo8VarL != null) {
                                                vo8VarL.b(null);
                                            }
                                        } else {
                                            zv8[] zv8VarArr7 = jce.D;
                                            vo8Var = (vo8) p3cVar.m(jceVarI1, zv8VarArr7[0]);
                                            if (vo8Var != null) {
                                                a8j.x(qbeVar.e, new obe(jceVarI1.c, new tnh(R.string.audio_record_hold_to_start)));
                                                a8j.x(ic6Var, rbe.a);
                                                jceVarI1.G().d();
                                            }
                                            vo8Var2 = (vo8) p3cVar.m(jceVarI1, zv8VarArr7[0]);
                                            if (vo8Var2 != null) {
                                                vo8Var2.b(null);
                                            }
                                            vo8VarL = jceVarI1.L();
                                            if (vo8VarL != null) {
                                                vo8VarL.b(null);
                                            }
                                        }
                                    } else if (motionEvent.getAction() == 3) {
                                        jceVarI1.E();
                                    } else if (motionEvent.getAction() == 1) {
                                        if (jceVarI1.s.a.getValue() instanceof bce) {
                                            a8j.x(jceVarI1.w, motionEvent);
                                        }
                                    } else if (jceVarI1.s.a.getValue() instanceof bce) {
                                        a8j.x(jceVarI1.w, motionEvent);
                                    }
                                }
                            } else {
                                wsc wscVarV2 = messageWriteWidget.v1();
                                svj svjVar = new svj(messageWriteWidget, 1);
                                int iC1 = messageWriteWidget.C1();
                                wscVarV2.getClass();
                                wsc.q(wscVarV2, svjVar, strArr, 181, R.string.permissions_video_message_request, iC1, null, 32);
                            }
                        } else {
                            if (iOrdinal2 != 1) {
                                ore.o();
                                return null;
                            }
                            if (messageWriteWidget.v1().c(wsc.i)) {
                                iOrdinal = fbeVar.ordinal();
                                if (iOrdinal == 0) {
                                    videoMessageRecordAnchor = messageWriteWidget.t1().getVideoMessageRecordAnchor();
                                } else {
                                    if (iOrdinal != 1) {
                                        ore.o();
                                        return null;
                                    }
                                    videoMessageRecordAnchor = messageWriteWidget.t1().getAudioRecordAnchor();
                                }
                                if (videoMessageRecordAnchor != null) {
                                    recordControlsWidget.w1 = videoMessageRecordAnchor.getX();
                                    jceVarI1 = recordControlsWidget.I1();
                                    int i9 = recordControlsWidget.X;
                                    ic6Var = jceVarI1.v;
                                    p3cVar = jceVarI1.z;
                                    qbeVar = jceVarI1.d;
                                    if (jceVarI1.r.getValue() == null) {
                                        if (motionEvent.getAction() == 0) {
                                            if (((Boolean) jceVarI1.e.invoke()).booleanValue()) {
                                                qbeVar.C(jceVarI1.F(), true);
                                            } else if (jceVarI1.K().g()) {
                                                a8j.x(ic6Var, sbe.a);
                                            } else {
                                                p3cVar.B(jceVarI1, jce.D[0], yab.i0(jceVarI1.b, null, 2, new ur8(jceVarI1, r12, i3), 1));
                                            }
                                        } else if (motionEvent.getAction() != 1) {
                                            zv8[] zv8VarArr8 = jce.D;
                                            vo8Var = (vo8) p3cVar.m(jceVarI1, zv8VarArr8[0]);
                                            if (vo8Var != null) {
                                                a8j.x(qbeVar.e, new obe(jceVarI1.c, new tnh(R.string.audio_record_hold_to_start)));
                                                a8j.x(ic6Var, rbe.a);
                                                jceVarI1.G().d();
                                            }
                                            vo8Var2 = (vo8) p3cVar.m(jceVarI1, zv8VarArr8[0]);
                                            if (vo8Var2 != null) {
                                                vo8Var2.b(null);
                                            }
                                            vo8VarL = jceVarI1.L();
                                            if (vo8VarL != null) {
                                                vo8VarL.b(null);
                                            }
                                        } else {
                                            zv8[] zv8VarArr9 = jce.D;
                                            vo8Var = (vo8) p3cVar.m(jceVarI1, zv8VarArr9[0]);
                                            if (vo8Var != null) {
                                                a8j.x(qbeVar.e, new obe(jceVarI1.c, new tnh(R.string.audio_record_hold_to_start)));
                                                a8j.x(ic6Var, rbe.a);
                                                jceVarI1.G().d();
                                            }
                                            vo8Var2 = (vo8) p3cVar.m(jceVarI1, zv8VarArr9[0]);
                                            if (vo8Var2 != null) {
                                                vo8Var2.b(null);
                                            }
                                            vo8VarL = jceVarI1.L();
                                            if (vo8VarL != null) {
                                                vo8VarL.b(null);
                                            }
                                        }
                                    } else if (motionEvent.getAction() == 3) {
                                        jceVarI1.E();
                                    } else if (motionEvent.getAction() == 1) {
                                        if (jceVarI1.s.a.getValue() instanceof bce) {
                                            a8j.x(jceVarI1.w, motionEvent);
                                        }
                                    } else if (jceVarI1.s.a.getValue() instanceof bce) {
                                        a8j.x(jceVarI1.w, motionEvent);
                                    }
                                }
                            } else {
                                messageWriteWidget.v1().k(new svj(messageWriteWidget, 1), R.string.permissions_audio_request_denied);
                            }
                        }
                    }
                }
                return sbiVar;
            case 6:
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                zv8[] zv8VarArr10 = MessageWriteWidget.I;
                messageWriteWidget.t1().setVideoMessageEnabled(zBooleanValue);
                return sbiVar;
            case 7:
                ch3.d0(obj);
                zv8[] zv8VarArr11 = MessageWriteWidget.I;
                messageWriteWidget.t1().setScheduledMessagesButtonState((gha) obj2);
                return sbiVar;
            case 8:
                ch3.d0(obj);
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                zv8[] zv8VarArr12 = MessageWriteWidget.I;
                if (messageWriteWidget.getView() != null) {
                    messageWriteWidget.t1().setInputEnabled(!zBooleanValue2);
                }
                return sbiVar;
            case 9:
                ch3.d0(obj);
                ela elaVar = (ela) obj2;
                if (elaVar instanceof dla) {
                    zv8[] zv8VarArr13 = MessageWriteWidget.I;
                    o6g o6gVarG = sol.g(messageWriteWidget, messageWriteWidget.t1().getMessagePreviewAnchor(), ((dla) elaVar).a, new yma(messageWriteWidget, 1));
                    int i10 = uw8.a;
                    if (uw8.b(uw8.c)) {
                        messageWriteWidget.F.B(messageWriteWidget, MessageWriteWidget.I[7], e9i.j0(new fz6(n1g.v(new jz(new xc3(uw8.f, 17), 11), messageWriteWidget.getViewLifecycleOwner().f(), n09.d), new qz9((lq4) r12, o6gVarG, i4), i5), messageWriteWidget.getViewLifecycleScope()));
                    }
                } else {
                    if (!(elaVar instanceof cla)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr14 = BottomSheetWidget.t;
                    ScheduledSendPickerBottomSheet scheduledSendPickerBottomSheet = new ScheduledSendPickerBottomSheet(messageWriteWidget.getC().b(), 1L, ((cla) elaVar).a, null, 8, null);
                    scheduledSendPickerBottomSheet.setTargetController(messageWriteWidget);
                    br4 parentController = messageWriteWidget;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(scheduledSendPickerBottomSheet, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                }
                return sbiVar;
            case 10:
                ch3.d0(obj);
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                zv8[] zv8VarArr15 = MessageWriteWidget.I;
                messageWriteWidget.t1().setRightOuterIconActionState(new iha(new cha(zBooleanValue3)));
                return sbiVar;
            case 11:
                ch3.d0(obj);
                rj9 rj9Var = (rj9) obj2;
                int iD = qt4.D(rj9Var.b);
                if (iD == 0) {
                    j8e j8eVar = messageWriteWidget.s;
                    zv8[] zv8VarArr16 = MessageWriteWidget.I;
                    messageWriteWidget.t1().setLeftIcon(R.drawable.icon_sticker);
                    zv8[] zv8VarArr17 = MessageWriteWidget.I;
                    ((RecyclerView) j8eVar.m(messageWriteWidget, zv8VarArr17[3])).setVisibility(8);
                    ((RecyclerView) j8eVar.m(messageWriteWidget, zv8VarArr17[3])).w0(0);
                    messageWriteWidget.t1().setSelection(messageWriteWidget.t1().getSelectionEnd());
                } else if (iD == 1) {
                    zv8[] zv8VarArr18 = MessageWriteWidget.I;
                    messageWriteWidget.t1().setLeftIcon(R.drawable.icon_text);
                } else {
                    if (iD != 2) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr19 = MessageWriteWidget.I;
                    messageWriteWidget.t1().setLeftIcon(R.drawable.icon_cross_round);
                    ((sj9) messageWriteWidget.D.getValue()).H(rj9Var.a);
                    ((RecyclerView) messageWriteWidget.s.m(messageWriteWidget, MessageWriteWidget.I[3])).setVisibility(0);
                }
                return sbiVar;
            case 12:
                ch3.d0(obj);
                vj9 vj9Var = (vj9) obj2;
                if (vj9Var instanceof tj9) {
                    fn9 fn9Var = messageWriteWidget.w;
                    if (fn9Var != null) {
                        tj9 tj9Var = (tj9) vj9Var;
                        fn9Var.d(tj9Var.a, tj9Var.b, tj9Var.c);
                    }
                } else {
                    if (!(vj9Var instanceof uj9)) {
                        ore.o();
                        return null;
                    }
                    uj9 uj9Var = (uj9) vj9Var;
                    fn9 fn9Var2 = messageWriteWidget.w;
                    if (fn9Var2 != null) {
                        fn9Var2.a(uj9Var.a, uj9Var.b, uj9Var.c, uj9Var.d);
                    }
                }
                return sbiVar;
            case 13:
                ch3.d0(obj);
                CharSequence charSequence = (CharSequence) obj2;
                zv8[] zv8VarArr20 = MessageWriteWidget.I;
                CharSequence charSequence2 = messageWriteWidget.B1().C().a;
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                messageWriteWidget.B1().g.B(messageWriteWidget.t1(), charSequence2);
                x9h x9hVarB1 = messageWriteWidget.B1();
                CharSequence text2 = messageWriteWidget.t1().getText();
                String string = text2 != null ? text2.toString() : null;
                mjg mjgVar2 = x9hVarB1.w;
                do {
                    value2 = mjgVar2.getValue();
                } while (!mjgVar2.h(value2, string));
                messageWriteWidget.B1().G(null);
                nma nmaVarA1 = messageWriteWidget.A1();
                nmaVarA1.x1 = charSequence;
                ny8 ny8Var = nmaVarA1.f;
                nmaVarA1.v.B(nmaVarA1, nma.y1[0], yab.h0(nmaVarA1.b, ((n0c) ((xhh) nmaVarA1.p.getValue())).a(), 2, new qz9(nmaVarA1, charSequence, r12, i2)));
                if (nmaVarA1.d.h()) {
                    xb9 xb9Var = (xb9) ((et3) ny8Var.getValue());
                    gvb gvbVar = xb9Var.I0;
                    zv8[] zv8VarArr21 = xb9.g1;
                    if (!((Boolean) gvbVar.m(xb9Var, zv8VarArr21[26])).booleanValue()) {
                        if ((charSequence != null ? charSequence.length() : 0) > 2 && (rt2Var = (rt2) nmaVarA1.c.getValue()) != null && sol.a(rt2Var, (wo6) nmaVarA1.g.getValue())) {
                            a8j.x(nmaVarA1.x, yla.a);
                            xb9 xb9Var2 = (xb9) ((et3) ny8Var.getValue());
                            xb9Var2.I0.B(xb9Var2, zv8VarArr21[26], Boolean.TRUE);
                        }
                    }
                }
                return sbiVar;
            case 14:
                ch3.d0(obj);
                CharSequence charSequence3 = (CharSequence) obj2;
                zv8[] zv8VarArr22 = MessageWriteWidget.I;
                messageWriteWidget.t1().setText(charSequence3);
                messageWriteWidget.t1().n(charSequence3.length());
                return sbiVar;
            case 15:
                ch3.d0(obj);
                r9h r9hVar = (r9h) obj2;
                qp4 qp4Var = messageWriteWidget.x;
                if (qp4Var != null) {
                    qp4Var.dismiss();
                }
                if (r9hVar != null) {
                    u9h u9hVar = r9hVar.b;
                    if (!u9hVar.f.isEmpty()) {
                        View view3 = r9hVar.a;
                        ha9 ha9VarB = messageWriteWidget.getC().b();
                        List list = u9hVar.f;
                        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
                        Iterator it = list.iterator();
                        while (true) {
                            int i11 = i6;
                            if (it.hasNext()) {
                                Object next = it.next();
                                i6 = i11 + 1;
                                if (i11 < 0) {
                                    xw3.V0();
                                    throw null;
                                }
                                arrayList.add(new rp4(i11, new xnh((String) next), (Integer) null, (Integer) null, 28));
                            } else {
                                qp4 qp4VarBuild = opl.a(1, ha9VarB).f(view3).l(arrayList).b().build();
                                qp4VarBuild.u(messageWriteWidget);
                                messageWriteWidget.x = qp4VarBuild;
                            }
                        }
                    }
                }
                return sbiVar;
            case 16:
                ch3.d0(obj);
                u9h u9hVar2 = (u9h) obj2;
                if (u9hVar2.g == 3) {
                    zv8[] zv8VarArr23 = MessageWriteWidget.I;
                    nma.O(messageWriteWidget.A1(), u9hVar2.i(), null, 6);
                    messageWriteWidget.t1().setText(null);
                } else {
                    zv8[] zv8VarArr24 = MessageWriteWidget.I;
                    CharSequence charSequenceB = messageWriteWidget.B1().B(u9hVar2);
                    fik fikVar = messageWriteWidget.B1().g;
                    tha thaVarT1 = messageWriteWidget.t1();
                    fikVar.getClass();
                    fik.C(thaVarT1, charSequenceB, u9hVar2);
                }
                return sbiVar;
            case 17:
                ch3.d0(obj);
                jb jbVar = (jb) obj2;
                zv8[] zv8VarArr25 = MessageWriteWidget.I;
                messageWriteWidget.t1().requestFocus();
                fn9 fn9Var3 = messageWriteWidget.w;
                if (fn9Var3 != null) {
                    EditText editText = fn9Var3.a;
                    int i12 = jbVar.a;
                    int i13 = jbVar.b;
                    String str = jbVar.c;
                    if (str != null && (text = editText.getText()) != null && text.length() != 0) {
                        k59[] k59VarArr = (k59[]) text.getSpans(i12, i13, k59.class);
                        a8g a8gVar = pq3.j;
                        if (k59VarArr == null || k59VarArr.length == 0) {
                            tre.n0(text, str, i12, i13, a8gVar.e(editText.getContext()).m().getText().h, null, 32);
                        } else {
                            for (k59 k59Var : k59VarArr) {
                                int spanStart = text.getSpanStart(k59Var);
                                int spanEnd = text.getSpanEnd(k59Var);
                                if (spanStart == i12 && spanEnd == i13) {
                                    text.removeSpan(k59Var);
                                    tre.n0(text, str, i12, i13, a8gVar.e(editText.getContext()).m().getText().h, null, 32);
                                }
                            }
                        }
                    }
                }
                return sbiVar;
            case 18:
                ch3.d0(obj);
                ec6 ec6Var = (ec6) obj2;
                xka xkaVar = ec6Var != null ? (xka) ec6Var.a : null;
                zv8[] zv8VarArr26 = MessageWriteWidget.I;
                if (xkaVar != null) {
                    ehaVar = xkaVar.a;
                }
                messageWriteWidget.t1().setEmojiExpandableState(ehaVar);
                if (ehaVar == eha.b) {
                    tha thaVarT2 = messageWriteWidget.t1();
                    qma qmaVar = new qma(messageWriteWidget, 1);
                    pha phaVar = thaVarT2.f;
                    phaVar.setShowSoftInputOnFocus(false);
                    phaVar.setOnFocusChangeListener(new xga(0, qmaVar));
                }
                return sbiVar;
            case 19:
                ch3.d0(obj);
                ec6 ec6Var2 = (ec6) obj2;
                zka zkaVar = ec6Var2 != null ? (zka) ec6Var2.a : null;
                mjg mjgVar3 = messageWriteWidget.y;
                if ((zkaVar != null ? zkaVar.a : null) == yka.b) {
                    messageWriteWidget.t1().setLeftIcon(R.drawable.icon_keyboard);
                    Boolean bool = Boolean.TRUE;
                    mjgVar3.getClass();
                    mjgVar3.j(null, bool);
                } else {
                    messageWriteWidget.t1().setEmojiExpandableState(ehaVar);
                    tha thaVarT3 = messageWriteWidget.t1();
                    boolean z2 = !messageWriteWidget.A1().I();
                    pha phaVar2 = thaVarT3.f;
                    phaVar2.setShowSoftInputOnFocus(z2);
                    phaVar2.setOnFocusChangeListener(null);
                    messageWriteWidget.t1().setLeftIcon(R.drawable.icon_sticker);
                    Boolean bool2 = Boolean.FALSE;
                    mjgVar3.getClass();
                    mjgVar3.j(null, bool2);
                }
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ch3.d0(obj);
                kla klaVar = (kla) obj2;
                if (klaVar != null && klaVar.a) {
                    z = true;
                }
                zv8[] zv8VarArr27 = MessageWriteWidget.I;
                messageWriteWidget.t1().setLeftOuterIconVisible(z);
                if (z) {
                    messageWriteWidget.t1().setLeftOuterIconOnClickListener(new kj1(0, messageWriteWidget.A1(), nma.class, "onMiniAppClick", "onMiniAppClick$message_write_widget()V", 0, 21));
                    messageWriteWidget.t1().setLeftOuterIconText(klaVar != null ? klaVar.b : null);
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                zv8[] zv8VarArr28 = MessageWriteWidget.I;
                messageWriteWidget.t1().setKeyboardVisible(zBooleanValue4);
                mvh mvhVar = messageWriteWidget.A;
                if (mvhVar != null) {
                    mvhVar.dismiss();
                }
                messageWriteWidget.A = null;
                return sbiVar;
        }
    }
}
