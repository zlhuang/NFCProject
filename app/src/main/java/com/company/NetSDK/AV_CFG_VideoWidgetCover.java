package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Encode widget-Privacy mask setup
 * \else
 * �������-���򸲸�����
 * \endif
 */
public class AV_CFG_VideoWidgetCover implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Overlay to main stream 
	 * \else
	 * ���ӵ�������
	 * \endif
	 */
	public boolean			bEncodeBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 1
	 * \else
	 * ���ӵ�������1
	 * \endif
	 */
	public boolean			bEncodeBlendExtra1;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 2
	 * \else
	 * ���ӵ�������2
	 * \endif
	 */
	public boolean			bEncodeBlendExtra2;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 3
	 * \else
	 * ���ӵ�������3
	 * \endif
	 */
	public boolean			bEncodeBlendExtra3;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to snap
	 * \else
	 * ���ӵ�ץͼ
	 * \endif
	 */
	public boolean			bEncodeBlendSnapshot;
	
	/**
	 * \if ENGLISH_LANG
	 * Foreground color
	 * \else
	 * ǰ��ɫ
	 * \endif
	 */
	public AV_CFG_Color		stuFrontColor = new AV_CFG_Color();
	
	/**
	 * \if ENGLISH_LANG
	 * Background color 
	 * \else
	 * ����ɫ
	 * \endif
	 */
	public AV_CFG_Color		stuBackColor = new AV_CFG_Color();
	
	/**
	 * \if ENGLISH_LANG
	 * Zone. The coordinates value ranges from  0 to 8191
	 * \else
	 * ����, ����ȡֵ0~8191
	 * \endif
	 */
	public AV_CFG_Rect		stuRect = new AV_CFG_Rect();
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to preview mode
	 * \else
	 * ���ӵ�Ԥ����Ƶ
	 * \endif
	 */
	public boolean			bPreviewBlend;
}
