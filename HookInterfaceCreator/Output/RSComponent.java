package api.utilities.internal;


public interface RSComponent extends ga {
    String getButtonText();
    int getButtonType();
    int getChildIndex();
    RSComponent[] getChildren();
    int getClickMask();
    int getClientCode();
    int getColor();
    int getColor2();
    int[] getCs1ComparisonValues();
    int[] getCs1Comparisons();
    int[][] getCs1Instructions();
    int getCycle();
    int getDragDeadTime();
    int getDragDeadZone();
    boolean getFill();
    int getFontId();
    boolean getHasListener();
    int getHeight();
    int getHeightAlignment();
    int getId();
    int[] getInvTransmitTriggers();
    int[] getInventorySprites();
    int[] getInventoryXOffsets();
    int[] getInventoryYOffsets();
    boolean getIsDraggable();
    boolean getIsHidden();
    boolean getIsIf3();
    String[] getItemActions();
    int getItemId();
    int[] getItemIds();
    int[] getItemQuantities();
    int getItemQuantity();
    int getLineWid();
    int getModelAngleX();
    int getModelAngleY();
    int getModelAngleZ();
    int getModelFrame();
    int getModelFrameCycle();
    int getModelId();
    int getModelId2();
    int getModelOffsetX();
    int getModelOffsetY();
    boolean getModelOrthog();
    boolean getModelTransparency();
    int getModelType();
    int getModelType2();
    int getModelZoom();
    int getMouseOverColor();
    int getMouseOverColor2();
    int getMouseOverRedirect();
    boolean getNoClickThrough();
    Object[] getOnChatTransmit();
    Object[] getOnClanTransmit();
    Object[] getOnClick();
    Object[] getOnClickRepeat();
    Object[] getOnDialogAbort();
    Object[] getOnDrag();
    Object[] getOnDragComplete();
    Object[] getOnFriendTransmit();
    Object[] getOnHold();
    Object[] getOnInvTransmit();
    Object[] getOnKey();
    Object[] getOnLoad();
    Object[] getOnMiscTransmit();
    Object[] getOnMouseLeave();
    Object[] getOnMouseOver();
    Object[] getOnMouseRepeat();
    Object[] getOnOp();
    Object[] getOnRelease();
    Object[] getOnScrollWheel();
    Object[] getOnStatTransmit();
    Object[] getOnStockTransmit();
    Object[] getOnSubChange();
    Object[] getOnTargetEnter();
    Object[] getOnTargetLeave();
    Object[] getOnTimer();
    Object[] getOnVarTransmit();
    String getOpbase();
    String[] getOps();
    int getOutline();
    int getPaddingX();
    int getPaddingY();
    RSComponent getParent();
    int getParentId();
    int getRawHeight();
    int getRawWidth();
    int getRawX();
    int getRawY();
    RSRectangleMode getRectangleMode();
    int getRootIndex();
    int getScrollHeight();
    int getScrollWidth();
    int getScrollX();
    int getScrollY();
    int getSequenceId();
    int getSequenceId2();
    String getSpellName();
    int getSpriteAngle();
    boolean getSpriteFlipH();
    boolean getSpriteFlipV();
    int getSpriteId();
    int getSpriteId2();
    int getSpriteShadow();
    boolean getSpriteTiling();
    int[] getStatTransmitTriggers();
    String getTargetVerb();
    String getText();
    String getText2();
    int getTextLineHeight();
    boolean getTextShadowed();
    int getTextXAlignment();
    int getTextYAlignment();
    int getTransparency();
    int getType();
    int[] getVarTransmitTriggers();
    int getWidth();
    int getWidthAlignment();
    int getX();
    int getXAlignment();
    int getY();
    int getYAlignment();
    boolean get__bj();
    boolean get__cu();
    boolean get__fa();
    boolean get__fi();
    boolean get__fv();
    boolean get__fy();
    byte[][] get__ci();
    byte[][] get__cy();
    int get__al();
    int get__ar();
    int get__av();
    int get__ba();
    int get__bd();
    int get__bo();
    int get__fb();
    int get__fh();
    int get__fs();
    int get__ft();
    int[] get__cg();
    int[] get__cx();
    int[] get__fc();
    Object[] get__ec();
    Object[] get__eq();
}
