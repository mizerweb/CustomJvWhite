package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mce implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ mce(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        final int i2 = 1;
        int i3 = 8;
        final int i4 = 3;
        sbi sbiVar = sbi.a;
        final int i5 = 0;
        lq4 lq4Var = null;
        int i6 = 17;
        final RecordControlsWidget recordControlsWidget = this.b;
        switch (i) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) obj;
                zv8[] zv8VarArr = RecordControlsWidget.x1;
                View view = new View(frameLayout.getContext());
                view.setId(R.id.audio_record__dot_view);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
                layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), 0);
                layoutParams.gravity = 16;
                view.setLayoutParams(layoutParams);
                view.setBackground((GradientDrawable) recordControlsWidget.C.getValue());
                n1g.N(new vqa(recordControlsWidget, lq4Var, 19), view);
                frameLayout.addView(view);
                ImageView imageView = new ImageView(frameLayout.getContext());
                imageView.setId(R.id.audio_record__swipe_remove_button);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(36.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 36.0f));
                layoutParams2.gravity = 8388627;
                layoutParams2.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 6.0f);
                imageView.setLayoutParams(layoutParams2);
                int iK = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
                imageView.setPadding(iK, iK, iK, iK);
                imageView.setImageResource(R.drawable.icon_delete);
                imageView.setVisibility(8);
                frameLayout.addView(imageView);
                TextView textView = new TextView(frameLayout.getContext());
                textView.setId(R.id.audio_record__duration_view);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 8388627;
                layoutParams3.setMarginStart(gm0.K(8.0f * yl5.d().getDisplayMetrics().density) + zo5.b(20.0f, yl5.d().getDisplayMetrics().density, zo5.b(8.0f, yl5.d().getDisplayMetrics().density, gm0.K(4.0f * yl5.d().getDisplayMetrics().density))));
                textView.setLayoutParams(layoutParams3);
                q9i.a(q9i.e, textView);
                n1g.N(new xc9(i4, lq4Var, 12), textView);
                frameLayout.addView(textView);
                TextView textView2 = new TextView(frameLayout.getContext());
                textView2.setId(R.id.audio_record__cancel_view);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -1);
                layoutParams4.gravity = 17;
                textView2.setLayoutParams(layoutParams4);
                textView2.setGravity(17);
                textView2.setText(np4.q(recordControlsWidget.getContext(), R.string.cancel));
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((InsetDrawable) recordControlsWidget.z.getValue(), (Drawable) null, (Drawable) null, (Drawable) null);
                q9i.a(q9i.i, textView2);
                n1g.N(new vqa(recordControlsWidget, lq4Var, 18), textView2);
                frameLayout.addView(textView2);
                break;
            case 1:
                FrameLayout frameLayout2 = (FrameLayout) obj;
                zv8[] zv8VarArr2 = RecordControlsWidget.x1;
                fbe fbeVarH1 = recordControlsWidget.H1();
                pce pceVar = recordControlsWidget.w;
                if (fbeVarH1 == fbe.b) {
                    ycj ycjVar = new ycj(frameLayout2.getContext());
                    ycjVar.setCallback(new ft0(recordControlsWidget));
                    ycjVar.setDotDrawable((GradientDrawable) recordControlsWidget.C.getValue());
                    recordControlsWidget.v = ycjVar;
                    frameLayout2.addView(ycjVar);
                }
                ImageView imageView2 = new ImageView(frameLayout2.getContext());
                imageView2.setId(R.id.audio_record__remove_button);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 36.0f), gm0.K(yl5.d().getDisplayMetrics().density * 36.0f));
                layoutParams5.gravity = 8388691;
                layoutParams5.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f));
                imageView2.setLayoutParams(layoutParams5);
                int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
                imageView2.setPadding(iK2, iK2, iK2, iK2);
                imageView2.setImageResource(R.drawable.icon_delete);
                n1g.N(new o23(i4, lq4Var, 10), imageView2);
                qe7.H(imageView2, 300L, new View.OnClickListener() { // from class: oce
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i7 = i2;
                        RecordControlsWidget recordControlsWidget2 = recordControlsWidget;
                        switch (i7) {
                            case 0:
                                zv8[] zv8VarArr3 = RecordControlsWidget.x1;
                                jce jceVarI1 = recordControlsWidget2.I1();
                                mjg mjgVar = jceVarI1.r;
                                if (((dce) mjgVar.getValue()) instanceof zbe) {
                                    jceVarI1.U();
                                    if (((Boolean) jceVarI1.e.invoke()).booleanValue()) {
                                        jceVarI1.d.C(jceVarI1.F(), true);
                                    } else {
                                        lq4 lq4Var2 = null;
                                        try {
                                            jceVarI1.K().l();
                                            vc0 vc0VarH = jceVarI1.H();
                                            if (vc0VarH.o == null) {
                                                vc0VarH.o = yab.i0(vc0VarH.g, null, 0, new m5(vc0VarH, lq4Var2, 7), 3);
                                            }
                                            mjgVar.j(null, new bce(true, true));
                                            jceVarI1.J().c();
                                        } catch (RuntimeException unused) {
                                            jceVarI1.D();
                                            mjgVar.j(null, new cce(false, 3));
                                            return;
                                        }
                                    }
                                }
                                break;
                            case 1:
                                zv8[] zv8VarArr4 = RecordControlsWidget.x1;
                                recordControlsWidget2.I1().P();
                                break;
                            case 2:
                                zv8[] zv8VarArr5 = RecordControlsWidget.x1;
                                recordControlsWidget2.I1().T();
                                break;
                            default:
                                zv8[] zv8VarArr6 = RecordControlsWidget.x1;
                                jce jceVarI2 = recordControlsWidget2.I1();
                                if (!jceVarI2.O()) {
                                    jce.W(jceVarI2, 3);
                                } else {
                                    jceVarI2.E();
                                    jceVarI2.V();
                                }
                                break;
                        }
                    }
                });
                frameLayout2.addView(imageView2);
                ImageView imageView3 = new ImageView(frameLayout2.getContext());
                imageView3.setId(R.id.audio_record__pause_recording_button);
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(gm0.K(36.0f * yl5.d().getDisplayMetrics().density), gm0.K(36.0f * yl5.d().getDisplayMetrics().density));
                layoutParams6.gravity = 81;
                layoutParams6.setMargins(((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin, gm0.K(yl5.d().getDisplayMetrics().density * 6.0f));
                imageView3.setLayoutParams(layoutParams6);
                x05.j(4.0f, yl5.d().getDisplayMetrics().density, imageView3);
                imageView3.setImageResource(pceVar.b);
                n1g.N(new o23(i4, lq4Var, i3), imageView3);
                final int i7 = 2;
                qe7.H(imageView3, 300L, new View.OnClickListener() { // from class: oce
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i8 = i7;
                        RecordControlsWidget recordControlsWidget2 = recordControlsWidget;
                        switch (i8) {
                            case 0:
                                zv8[] zv8VarArr3 = RecordControlsWidget.x1;
                                jce jceVarI1 = recordControlsWidget2.I1();
                                mjg mjgVar = jceVarI1.r;
                                if (((dce) mjgVar.getValue()) instanceof zbe) {
                                    jceVarI1.U();
                                    if (((Boolean) jceVarI1.e.invoke()).booleanValue()) {
                                        jceVarI1.d.C(jceVarI1.F(), true);
                                    } else {
                                        lq4 lq4Var2 = null;
                                        try {
                                            jceVarI1.K().l();
                                            vc0 vc0VarH = jceVarI1.H();
                                            if (vc0VarH.o == null) {
                                                vc0VarH.o = yab.i0(vc0VarH.g, null, 0, new m5(vc0VarH, lq4Var2, 7), 3);
                                            }
                                            mjgVar.j(null, new bce(true, true));
                                            jceVarI1.J().c();
                                        } catch (RuntimeException unused) {
                                            jceVarI1.D();
                                            mjgVar.j(null, new cce(false, 3));
                                            return;
                                        }
                                    }
                                }
                                break;
                            case 1:
                                zv8[] zv8VarArr4 = RecordControlsWidget.x1;
                                recordControlsWidget2.I1().P();
                                break;
                            case 2:
                                zv8[] zv8VarArr5 = RecordControlsWidget.x1;
                                recordControlsWidget2.I1().T();
                                break;
                            default:
                                zv8[] zv8VarArr6 = RecordControlsWidget.x1;
                                jce jceVarI2 = recordControlsWidget2.I1();
                                if (!jceVarI2.O()) {
                                    jce.W(jceVarI2, 3);
                                } else {
                                    jceVarI2.E();
                                    jceVarI2.V();
                                }
                                break;
                        }
                    }
                });
                frameLayout2.addView(imageView3);
                ImageView imageView4 = new ImageView(frameLayout2.getContext());
                imageView4.setId(R.id.audio_record__play_recording_button);
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(gm0.K(36.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 36.0f));
                layoutParams7.gravity = 81;
                layoutParams7.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(0.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f));
                imageView4.setLayoutParams(layoutParams7);
                x05.j(4.0f, yl5.d().getDisplayMetrics().density, imageView4);
                imageView4.setImageResource(pceVar.c);
                n1g.N(new o23(i4, lq4Var, 9), imageView4);
                imageView4.setVisibility(8);
                qe7.H(imageView4, 300L, new View.OnClickListener() { // from class: oce
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i8 = i5;
                        RecordControlsWidget recordControlsWidget2 = recordControlsWidget;
                        switch (i8) {
                            case 0:
                                zv8[] zv8VarArr3 = RecordControlsWidget.x1;
                                jce jceVarI1 = recordControlsWidget2.I1();
                                mjg mjgVar = jceVarI1.r;
                                if (((dce) mjgVar.getValue()) instanceof zbe) {
                                    jceVarI1.U();
                                    if (((Boolean) jceVarI1.e.invoke()).booleanValue()) {
                                        jceVarI1.d.C(jceVarI1.F(), true);
                                    } else {
                                        lq4 lq4Var2 = null;
                                        try {
                                            jceVarI1.K().l();
                                            vc0 vc0VarH = jceVarI1.H();
                                            if (vc0VarH.o == null) {
                                                vc0VarH.o = yab.i0(vc0VarH.g, null, 0, new m5(vc0VarH, lq4Var2, 7), 3);
                                            }
                                            mjgVar.j(null, new bce(true, true));
                                            jceVarI1.J().c();
                                        } catch (RuntimeException unused) {
                                            jceVarI1.D();
                                            mjgVar.j(null, new cce(false, 3));
                                            return;
                                        }
                                    }
                                }
                                break;
                            case 1:
                                zv8[] zv8VarArr4 = RecordControlsWidget.x1;
                                recordControlsWidget2.I1().P();
                                break;
                            case 2:
                                zv8[] zv8VarArr5 = RecordControlsWidget.x1;
                                recordControlsWidget2.I1().T();
                                break;
                            default:
                                zv8[] zv8VarArr6 = RecordControlsWidget.x1;
                                jce jceVarI2 = recordControlsWidget2.I1();
                                if (!jceVarI2.O()) {
                                    jce.W(jceVarI2, 3);
                                } else {
                                    jceVarI2.E();
                                    jceVarI2.V();
                                }
                                break;
                        }
                    }
                });
                frameLayout2.addView(imageView4);
                break;
            case 2:
                FrameLayout frameLayout3 = (FrameLayout) obj;
                zv8[] zv8VarArr3 = RecordControlsWidget.x1;
                mce mceVar = new mce(recordControlsWidget, i4);
                View frameLayout4 = new FrameLayout(frameLayout3.getContext());
                frameLayout4.setId(R.id.audio_record__action_view_bg_container);
                FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams8.gravity = 17;
                frameLayout4.setLayoutParams(layoutParams8);
                mceVar.invoke(frameLayout4);
                frameLayout3.addView(frameLayout4);
                ImageView imageView5 = new ImageView(frameLayout3.getContext());
                imageView5.setId(R.id.audio_record__action_view);
                FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 36.0f), gm0.K(36.0f * yl5.d().getDisplayMetrics().density));
                layoutParams9.gravity = 17;
                imageView5.setLayoutParams(layoutParams9);
                x05.j(4.0f, yl5.d().getDisplayMetrics().density, imageView5);
                imageView5.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView5.setImageDrawable(recordControlsWidget.B1());
                imageView5.setOnLongClickListener(new cw0(7, recordControlsWidget));
                qe7.H(imageView5, 300L, new View.OnClickListener() { // from class: oce
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i8 = i4;
                        RecordControlsWidget recordControlsWidget2 = recordControlsWidget;
                        switch (i8) {
                            case 0:
                                zv8[] zv8VarArr4 = RecordControlsWidget.x1;
                                jce jceVarI1 = recordControlsWidget2.I1();
                                mjg mjgVar = jceVarI1.r;
                                if (((dce) mjgVar.getValue()) instanceof zbe) {
                                    jceVarI1.U();
                                    if (((Boolean) jceVarI1.e.invoke()).booleanValue()) {
                                        jceVarI1.d.C(jceVarI1.F(), true);
                                    } else {
                                        lq4 lq4Var2 = null;
                                        try {
                                            jceVarI1.K().l();
                                            vc0 vc0VarH = jceVarI1.H();
                                            if (vc0VarH.o == null) {
                                                vc0VarH.o = yab.i0(vc0VarH.g, null, 0, new m5(vc0VarH, lq4Var2, 7), 3);
                                            }
                                            mjgVar.j(null, new bce(true, true));
                                            jceVarI1.J().c();
                                        } catch (RuntimeException unused) {
                                            jceVarI1.D();
                                            mjgVar.j(null, new cce(false, 3));
                                            return;
                                        }
                                    }
                                }
                                break;
                            case 1:
                                zv8[] zv8VarArr5 = RecordControlsWidget.x1;
                                recordControlsWidget2.I1().P();
                                break;
                            case 2:
                                zv8[] zv8VarArr6 = RecordControlsWidget.x1;
                                recordControlsWidget2.I1().T();
                                break;
                            default:
                                zv8[] zv8VarArr7 = RecordControlsWidget.x1;
                                jce jceVarI2 = recordControlsWidget2.I1();
                                if (!jceVarI2.O()) {
                                    jce.W(jceVarI2, 3);
                                } else {
                                    jceVarI2.E();
                                    jceVarI2.V();
                                }
                                break;
                        }
                    }
                });
                n1g.N(new vqa(recordControlsWidget, lq4Var, i6), imageView5);
                frameLayout3.addView(imageView5);
                break;
            default:
                FrameLayout frameLayout5 = (FrameLayout) obj;
                zv8[] zv8VarArr4 = RecordControlsWidget.x1;
                View frameLayout6 = new FrameLayout(frameLayout5.getContext());
                frameLayout6.setId(R.id.audio_record__action_view_background);
                FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 124.0f), gm0.K(yl5.d().getDisplayMetrics().density * 124.0f));
                layoutParams10.gravity = 17;
                frameLayout6.setLayoutParams(layoutParams10);
                frameLayout6.setBackground((GradientDrawable) recordControlsWidget.A.getValue());
                n1g.N(new qce(1, null, recordControlsWidget), frameLayout6);
                frameLayout5.addView(frameLayout6);
                View frameLayout7 = new FrameLayout(frameLayout5.getContext());
                FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 124.0f), gm0.K(124.0f * yl5.d().getDisplayMetrics().density));
                layoutParams11.gravity = 17;
                frameLayout7.setLayoutParams(layoutParams11);
                frameLayout7.setBackground((GradientDrawable) recordControlsWidget.B.getValue());
                n1g.N(new qce(0, null, recordControlsWidget), frameLayout7);
                frameLayout5.addView(frameLayout7);
                break;
        }
        return sbiVar;
    }
}
