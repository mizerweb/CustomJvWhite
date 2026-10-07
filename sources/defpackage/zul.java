package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum zul implements oqk {
    TYPE_UNKNOWN(0),
    CUSTOM(1),
    /* JADX INFO: Fake field, exist only in values array */
    AUTOML_IMAGE_LABELING(2),
    BASE_TRANSLATE(3),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_OBJECT_DETECTION(4),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_IMAGE_LABELING(5),
    /* JADX INFO: Fake field, exist only in values array */
    BASE_ENTITY_EXTRACTION(6),
    BASE_DIGITAL_INK(7),
    /* JADX INFO: Fake field, exist only in values array */
    TOXICITY_DETECTION(8),
    /* JADX INFO: Fake field, exist only in values array */
    IMAGE_CAPTIONING(9),
    /* JADX INFO: Fake field, exist only in values array */
    DIGITAL_INK_SEGMENTATION(10);

    public final int a;

    zul(int i) {
        this.a = i;
    }

    @Override // defpackage.oqk
    public final int zza() {
        return this.a;
    }
}
