//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Created on:10.01.2017 - 11:25:17
// Last changed on: 10.01.2017 - 11:25:17
/**
 * @author Eternal Blue Flame
 */

package ebf.timsquared.models.rollingstock;

import ebf.tim.render.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class PullmansPalace extends ModelBase
{
	int textureX = 512;
	int textureY = 512;
	public PullmansPalace()
	{
		bodyModel = new ModelRendererTurbo[148];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}
		private void initbodyModel_1() {
			bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
			bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 1
			bodyModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 2
			bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
			bodyModel[4] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 4
			bodyModel[5] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 5
			bodyModel[6] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 6
			bodyModel[7] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 8
			bodyModel[8] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 19
			bodyModel[9] = new ModelRendererTurbo(this, 393, 1, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[10] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 78
			bodyModel[11] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 79
			bodyModel[12] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 80
			bodyModel[13] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 85
			bodyModel[14] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 87
			bodyModel[15] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 88
			bodyModel[16] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 89
			bodyModel[17] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 90
			bodyModel[18] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 91
			bodyModel[19] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 92
			bodyModel[20] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 93
			bodyModel[21] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 94
			bodyModel[22] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 95
			bodyModel[23] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 96
			bodyModel[24] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 97
			bodyModel[25] = new ModelRendererTurbo(this, 441, 17, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[26] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 69
			bodyModel[27] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 70
			bodyModel[28] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 71
			bodyModel[29] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 72
			bodyModel[30] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 73
			bodyModel[31] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 74
			bodyModel[32] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 75
			bodyModel[33] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 76
			bodyModel[34] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 77
			bodyModel[35] = new ModelRendererTurbo(this, 201, 25, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[36] = new ModelRendererTurbo(this, 225, 25, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[37] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 80
			bodyModel[38] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 81
			bodyModel[39] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 82
			bodyModel[40] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 83
			bodyModel[41] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 84
			bodyModel[42] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 85
			bodyModel[43] = new ModelRendererTurbo(this, 465, 25, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[44] = new ModelRendererTurbo(this, 489, 25, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[45] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 88
			bodyModel[46] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 89
			bodyModel[47] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 90
			bodyModel[48] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 91
			bodyModel[49] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 92
			bodyModel[50] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 93
			bodyModel[51] = new ModelRendererTurbo(this, 161, 33, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[52] = new ModelRendererTurbo(this, 249, 33, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[53] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 96
			bodyModel[54] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 97
			bodyModel[55] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 98
			bodyModel[56] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 10
			bodyModel[57] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 10
			bodyModel[58] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 10
			bodyModel[59] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 10
			bodyModel[60] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 10
			bodyModel[61] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 10
			bodyModel[62] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 10
			bodyModel[63] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 74
			bodyModel[64] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 75
			bodyModel[65] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 76
			bodyModel[66] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 77
			bodyModel[67] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 78
			bodyModel[68] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 79
			bodyModel[69] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // axle
			bodyModel[70] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // axle
			bodyModel[71] = new ModelRendererTurbo(this, 449, 49, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[72] = new ModelRendererTurbo(this, 473, 49, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[73] = new ModelRendererTurbo(this, 113, 65, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[74] = new ModelRendererTurbo(this, 137, 65, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[75] = new ModelRendererTurbo(this, 161, 65, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[76] = new ModelRendererTurbo(this, 185, 65, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[77] = new ModelRendererTurbo(this, 209, 65, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[78] = new ModelRendererTurbo(this, 233, 65, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[79] = new ModelRendererTurbo(this, 257, 65, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[80] = new ModelRendererTurbo(this, 281, 65, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[81] = new ModelRendererTurbo(this, 305, 65, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[82] = new ModelRendererTurbo(this, 329, 65, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[83] = new ModelRendererTurbo(this, 353, 65, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[84] = new ModelRendererTurbo(this, 377, 65, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[85] = new ModelRendererTurbo(this, 401, 65, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[86] = new ModelRendererTurbo(this, 425, 65, textureX, textureY, StaticModelAnimator.tagWheel); // wheel
			bodyModel[87] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 2
			bodyModel[88] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 1
			bodyModel[89] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 90
			bodyModel[90] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 90
			bodyModel[91] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 90
			bodyModel[92] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 90
			bodyModel[93] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 90
			bodyModel[94] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 90
			bodyModel[95] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 90
			bodyModel[96] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 90
			bodyModel[97] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 90
			bodyModel[98] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 90
			bodyModel[99] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 90
			bodyModel[100] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 90
			bodyModel[101] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 19
			bodyModel[102] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 19
			bodyModel[103] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 8
			bodyModel[104] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 8
			bodyModel[105] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 90
			bodyModel[106] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 90
			bodyModel[107] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 90
			bodyModel[108] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 90
			bodyModel[109] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 90
			bodyModel[110] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 90
			bodyModel[111] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 90
			bodyModel[112] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 90
			bodyModel[113] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 90
			bodyModel[114] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 90
			bodyModel[115] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 90
			bodyModel[116] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 90
			bodyModel[117] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 90
			bodyModel[118] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 90
			bodyModel[119] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 90
			bodyModel[120] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 90
			bodyModel[121] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 90
			bodyModel[122] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 90
			bodyModel[123] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 90
			bodyModel[124] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 90
			bodyModel[125] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 90
			bodyModel[126] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 90
			bodyModel[127] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 90
			bodyModel[128] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 90
			bodyModel[129] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 90
			bodyModel[130] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 90
			bodyModel[131] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 90
			bodyModel[132] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 90
			bodyModel[133] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 90
			bodyModel[134] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 90
			bodyModel[135] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 90
			bodyModel[136] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 90
			bodyModel[137] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 90
			bodyModel[138] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 90
			bodyModel[139] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 90
			bodyModel[140] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 90
			bodyModel[141] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 8
			bodyModel[142] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 8
			bodyModel[143] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 8
			bodyModel[144] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 8
			bodyModel[145] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 8
			bodyModel[146] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 8
			bodyModel[147] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 8

			bodyModel[0].addBox(0F, -0.5F, 0F, 52, 1, 22, 0F); // Box 0
			bodyModel[0].setRotationPoint(-26F, -0.5F, -11F);

			bodyModel[1].addBox(0F, 0F, 0F, 40, 19, 1, 0F); // Box 1
			bodyModel[1].setRotationPoint(-20F, -20F, 10F);

			bodyModel[2].addBox(0F, 0F, 0F, 40, 19, 1, 0F); // Box 2
			bodyModel[2].setRotationPoint(-20F, -20F, -11F);

			bodyModel[3].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Box 3
			bodyModel[3].setRotationPoint(25F, -11F, -11F);

			bodyModel[4].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Box 4
			bodyModel[4].setRotationPoint(25F, -11F, 3F);

			bodyModel[5].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Box 5
			bodyModel[5].setRotationPoint(-26F, -11F, 3F);

			bodyModel[6].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Box 6
			bodyModel[6].setRotationPoint(-26F, -11F, -11F);

			bodyModel[7].addBox(0F, 0F, -6F, 1, 20, 6, 0F); // Box 8
			bodyModel[7].setRotationPoint(-20F, -21F, 3F);

			bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 19
			bodyModel[8].setRotationPoint(-26F, -7F, -3F);

			bodyModel[9].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[9].setRotationPoint(12F, 5F, -6F);

			bodyModel[10].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Box 78
			bodyModel[10].setRotationPoint(4.5F, -0.5F, -7F);

			bodyModel[11].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 79
			bodyModel[11].setRotationPoint(7.5F, 1.5F, -7F);

			bodyModel[12].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 80
			bodyModel[12].setRotationPoint(10.5F, 3.5F, -7F);

			bodyModel[13].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 85
			bodyModel[13].setRotationPoint(-25F, 0F, 11F);

			bodyModel[14].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 87
			bodyModel[14].setRotationPoint(-25F, 2F, 12F);

			bodyModel[15].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 88
			bodyModel[15].setRotationPoint(-25F, 4F, 13F);

			bodyModel[16].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 89
			bodyModel[16].setRotationPoint(20F, 4F, 13F);

			bodyModel[17].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 90
			bodyModel[17].setRotationPoint(20F, 2F, 12F);

			bodyModel[18].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 91
			bodyModel[18].setRotationPoint(20F, 0F, 11F);

			bodyModel[19].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 92
			bodyModel[19].setRotationPoint(20F, 4F, -14F);

			bodyModel[20].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 93
			bodyModel[20].setRotationPoint(20F, 2F, -13F);

			bodyModel[21].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 94
			bodyModel[21].setRotationPoint(20F, 0F, -12F);

			bodyModel[22].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 95
			bodyModel[22].setRotationPoint(-25F, 4F, -14F);

			bodyModel[23].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 96
			bodyModel[23].setRotationPoint(-25F, 2F, -13F);

			bodyModel[24].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 97
			bodyModel[24].setRotationPoint(-25F, 0F, -12F);

			bodyModel[25].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[25].setRotationPoint(12F, 5F, -5.5F);

			bodyModel[26].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Box 69
			bodyModel[26].setRotationPoint(4.5F, -0.5F, -5.5F);

			bodyModel[27].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 70
			bodyModel[27].setRotationPoint(7.5F, 1.5F, -5.5F);

			bodyModel[28].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 71
			bodyModel[28].setRotationPoint(10.5F, 3.5F, -5.5F);

			bodyModel[29].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Box 72
			bodyModel[29].setRotationPoint(4.5F, -0.5F, 6F);

			bodyModel[30].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 73
			bodyModel[30].setRotationPoint(7.5F, 1.5F, 6F);

			bodyModel[31].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 74
			bodyModel[31].setRotationPoint(10.5F, 3.5F, 6F);

			bodyModel[32].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Box 75
			bodyModel[32].setRotationPoint(4.5F, -0.5F, 4.5F);

			bodyModel[33].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 76
			bodyModel[33].setRotationPoint(7.5F, 1.5F, 4.5F);

			bodyModel[34].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 77
			bodyModel[34].setRotationPoint(10.5F, 3.5F, 4.5F);

			bodyModel[35].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[35].setRotationPoint(12F, 5F, 5.5F);

			bodyModel[36].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[36].setRotationPoint(12F, 5F, 6F);

			bodyModel[37].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Box 80
			bodyModel[37].setRotationPoint(-19.5F, -0.5F, 6F);

			bodyModel[38].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 81
			bodyModel[38].setRotationPoint(-16.5F, 1.5F, 6F);

			bodyModel[39].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 82
			bodyModel[39].setRotationPoint(-13.5F, 3.5F, 6F);

			bodyModel[40].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Box 83
			bodyModel[40].setRotationPoint(-19.5F, -0.5F, 4.5F);

			bodyModel[41].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 84
			bodyModel[41].setRotationPoint(-16.5F, 1.5F, 4.5F);

			bodyModel[42].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 85
			bodyModel[42].setRotationPoint(-13.5F, 3.5F, 4.5F);

			bodyModel[43].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[43].setRotationPoint(-12F, 5F, 5.5F);

			bodyModel[44].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[44].setRotationPoint(-12F, 5F, 6F);

			bodyModel[45].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Box 88
			bodyModel[45].setRotationPoint(-19.5F, -0.5F, -5.5F);

			bodyModel[46].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 89
			bodyModel[46].setRotationPoint(-16.5F, 1.5F, -5.5F);

			bodyModel[47].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 90
			bodyModel[47].setRotationPoint(-13.5F, 3.5F, -5.5F);

			bodyModel[48].addBox(0F, 0F, 0F, 15, 2, 1, 0F); // Box 91
			bodyModel[48].setRotationPoint(-19.5F, -0.5F, -7F);

			bodyModel[49].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 92
			bodyModel[49].setRotationPoint(-16.5F, 1.5F, -7F);

			bodyModel[50].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 93
			bodyModel[50].setRotationPoint(-13.5F, 3.5F, -7F);

			bodyModel[51].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[51].setRotationPoint(-12F, 5F, -6F);

			bodyModel[52].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[52].setRotationPoint(-12F, 5F, -5.5F);

			bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 96
			bodyModel[53].setRotationPoint(-26F, -9F, -3F);

			bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 97
			bodyModel[54].setRotationPoint(25F, -9F, -3F);

			bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 98
			bodyModel[55].setRotationPoint(25F, -7F, -3F);

			bodyModel[56].addBox(0F, 0F, 0F, 52, 1, 1, 0F); // Box 10
			bodyModel[56].setRotationPoint(-26F, -21F, -11F);

			bodyModel[57].addBox(0F, 0F, 0F, 52, 2, 1, 0F); // Box 10
			bodyModel[57].setRotationPoint(-26F, -23F, -10F);

			bodyModel[58].addBox(0F, 0F, 0F, 52, 1, 1, 0F); // Box 10
			bodyModel[58].setRotationPoint(-26F, -23F, -9F);

			bodyModel[59].addBox(0F, 0F, 0F, 52, 2, 1, 0F); // Box 10
			bodyModel[59].setRotationPoint(-26F, -25F, -8F);

			bodyModel[60].addBox(0F, 0F, 0F, 52, 1, 2, 0F); // Box 10
			bodyModel[60].setRotationPoint(-26F, -26F, -7F);

			bodyModel[61].addBox(0F, 0F, 0F, 52, 1, 2, 0F); // Box 10
			bodyModel[61].setRotationPoint(-26F, -27F, -5F);

			bodyModel[62].addBox(0F, 0F, 0F, 52, 1, 6, 0F); // Box 10
			bodyModel[62].setRotationPoint(-26F, -28F, -3F);

			bodyModel[63].addBox(0F, 0F, 0F, 52, 1, 1, 0F); // Box 74
			bodyModel[63].setRotationPoint(-26F, -21F, 10F);

			bodyModel[64].addBox(0F, 0F, 0F, 52, 2, 1, 0F); // Box 75
			bodyModel[64].setRotationPoint(-26F, -23F, 9F);

			bodyModel[65].addBox(0F, 0F, 0F, 52, 1, 1, 0F); // Box 76
			bodyModel[65].setRotationPoint(-26F, -23F, 8F);

			bodyModel[66].addBox(0F, 0F, 0F, 52, 2, 1, 0F); // Box 77
			bodyModel[66].setRotationPoint(-26F, -25F, 7F);

			bodyModel[67].addBox(0F, 0F, 0F, 52, 1, 2, 0F); // Box 78
			bodyModel[67].setRotationPoint(-26F, -26F, 5F);

			bodyModel[68].addBox(0F, 0F, 0F, 52, 1, 2, 0F); // Box 79
			bodyModel[68].setRotationPoint(-26F, -27F, 3F);

			bodyModel[69].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // axle
			bodyModel[69].setRotationPoint(-12.5F, 4.5F, -6F);

			bodyModel[70].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // axle
			bodyModel[70].setRotationPoint(11.5F, 4.5F, -6F);

			bodyModel[71].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[71].setRotationPoint(12F, 5F, -5.9F);

			bodyModel[72].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[72].setRotationPoint(-12F, 5F, -5.9F);

			bodyModel[73].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[73].setRotationPoint(12F, 5F, -5.8F);

			bodyModel[74].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[74].setRotationPoint(-12F, 5F, -5.8F);

			bodyModel[75].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[75].setRotationPoint(12F, 5F, -5.7F);

			bodyModel[76].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[76].setRotationPoint(-12F, 5F, -5.7F);

			bodyModel[77].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[77].setRotationPoint(12F, 5F, -5.6F);

			bodyModel[78].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[78].setRotationPoint(-12F, 5F, -5.6F);

			bodyModel[79].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[79].setRotationPoint(12F, 5F, 5.6F);

			bodyModel[80].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[80].setRotationPoint(-12F, 5F, 5.6F);

			bodyModel[81].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[81].setRotationPoint(12F, 5F, 5.7F);

			bodyModel[82].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[82].setRotationPoint(-12F, 5F, 5.7F);

			bodyModel[83].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[83].setRotationPoint(12F, 5F, 5.8F);

			bodyModel[84].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[84].setRotationPoint(-12F, 5F, 5.8F);

			bodyModel[85].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[85].setRotationPoint(12F, 5F, 5.9F);

			bodyModel[86].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // wheel
			bodyModel[86].setRotationPoint(-12F, 5F, 5.9F);

			bodyModel[87].addBox(0F, 0F, 0F, 38, 19, 0, 0F); // Box 2
			bodyModel[87].setRotationPoint(-19F, -20F, -9.99F);

			bodyModel[88].addBox(0F, 0F, 0F, 38, 19, 0, 0F); // Box 1
			bodyModel[88].setRotationPoint(-19F, -20F, 9.99F);

			bodyModel[89].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 90
			bodyModel[89].setRotationPoint(-8.38F, -5F, 3F);

			bodyModel[90].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 90
			bodyModel[90].setRotationPoint(-8.38F, -12F, 8F);

			bodyModel[91].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[91].setRotationPoint(-8.38F, -6F, 5F);

			bodyModel[92].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[92].setRotationPoint(-9.38F, -7F, 4F);

			bodyModel[93].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[93].setRotationPoint(1.37F, -6F, 5F);

			bodyModel[94].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[94].setRotationPoint(-2.38F, -7F, 4F);

			bodyModel[95].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 90
			bodyModel[95].setRotationPoint(-8.38F, -5F, -10F);

			bodyModel[96].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 90
			bodyModel[96].setRotationPoint(-8.38F, -12F, -10F);

			bodyModel[97].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[97].setRotationPoint(-8.38F, -6F, -8F);

			bodyModel[98].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[98].setRotationPoint(-9.38F, -7F, -8F);

			bodyModel[99].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[99].setRotationPoint(-2.38F, -7F, -8F);

			bodyModel[100].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[100].setRotationPoint(1.37F, -6F, -8F);

			bodyModel[101].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 19
			bodyModel[101].setRotationPoint(-29F, 0F, -1F);

			bodyModel[102].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 19
			bodyModel[102].setRotationPoint(24F, 0F, -1F);

			bodyModel[103].addBox(0F, 0F, 0F, 0, 20, 20, 0F); // Box 8
			bodyModel[103].setRotationPoint(-18.99F, -21F, -10F);

			bodyModel[104].addBox(0F, 0F, 0F, 0, 20, 20, 0F); // Box 8
			bodyModel[104].setRotationPoint(18.99F, -21F, -10F);

			bodyModel[105].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 90
			bodyModel[105].setRotationPoint(1.37F, -5F, 3F);

			bodyModel[106].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 90
			bodyModel[106].setRotationPoint(1.37F, -12F, 8F);

			bodyModel[107].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[107].setRotationPoint(-2.38F, -6F, 5F);

			bodyModel[108].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[108].setRotationPoint(0.37F, -7F, 4F);

			bodyModel[109].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[109].setRotationPoint(7.37F, -6F, 5F);

			bodyModel[110].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[110].setRotationPoint(7.37F, -7F, 4F);

			bodyModel[111].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 90
			bodyModel[111].setRotationPoint(1.37F, -5F, -10F);

			bodyModel[112].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 90
			bodyModel[112].setRotationPoint(1.37F, -12F, -10F);

			bodyModel[113].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[113].setRotationPoint(-2.38F, -6F, -8F);

			bodyModel[114].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[114].setRotationPoint(0.37F, -7F, -8F);

			bodyModel[115].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[115].setRotationPoint(7.37F, -7F, -8F);

			bodyModel[116].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[116].setRotationPoint(7.37F, -6F, -8F);

			bodyModel[117].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 90
			bodyModel[117].setRotationPoint(11F, -5F, 3F);

			bodyModel[118].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 90
			bodyModel[118].setRotationPoint(11F, -12F, 8F);

			bodyModel[119].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[119].setRotationPoint(11F, -6F, 5F);

			bodyModel[120].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[120].setRotationPoint(10F, -7F, 4F);

			bodyModel[121].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[121].setRotationPoint(17F, -6F, 5F);

			bodyModel[122].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[122].setRotationPoint(17F, -7F, 4F);

			bodyModel[123].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 90
			bodyModel[123].setRotationPoint(11F, -5F, -10F);

			bodyModel[124].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 90
			bodyModel[124].setRotationPoint(11F, -12F, -10F);

			bodyModel[125].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[125].setRotationPoint(11F, -6F, -8F);

			bodyModel[126].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[126].setRotationPoint(10F, -7F, -8F);

			bodyModel[127].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[127].setRotationPoint(17F, -7F, -8F);

			bodyModel[128].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[128].setRotationPoint(17F, -6F, -8F);

			bodyModel[129].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 90
			bodyModel[129].setRotationPoint(-18F, -5F, 3F);

			bodyModel[130].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 90
			bodyModel[130].setRotationPoint(-18F, -12F, 8F);

			bodyModel[131].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[131].setRotationPoint(-18F, -6F, 5F);

			bodyModel[132].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[132].setRotationPoint(-19F, -7F, 4F);

			bodyModel[133].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[133].setRotationPoint(-12F, -6F, 5F);

			bodyModel[134].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[134].setRotationPoint(-12F, -7F, 4F);

			bodyModel[135].addBox(0F, 0F, 0F, 7, 4, 7, 0F); // Box 90
			bodyModel[135].setRotationPoint(-18F, -5F, -10F);

			bodyModel[136].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 90
			bodyModel[136].setRotationPoint(-18F, -12F, -10F);

			bodyModel[137].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[137].setRotationPoint(-18F, -6F, -8F);

			bodyModel[138].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[138].setRotationPoint(-19F, -7F, -8F);

			bodyModel[139].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 90
			bodyModel[139].setRotationPoint(-12F, -7F, -8F);

			bodyModel[140].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 90
			bodyModel[140].setRotationPoint(-12F, -6F, -8F);

			bodyModel[141].addBox(0F, 0F, 0F, 1, 6, 20, 0F); // Box 8
			bodyModel[141].setRotationPoint(-20F, -27F, -10F);

			bodyModel[142].addBox(0F, 0F, 0F, 1, 20, 7, 0F); // Box 8
			bodyModel[142].setRotationPoint(-20F, -21F, -10F);

			bodyModel[143].addBox(0F, 0F, 0F, 1, 20, 7, 0F); // Box 8
			bodyModel[143].setRotationPoint(-20F, -21F, 3F);

			bodyModel[144].addBox(-1F, 0F, 0F, 1, 20, 6, 0F); // Box 8
			bodyModel[144].setRotationPoint(20F, -21F, -3F);

			bodyModel[145].addBox(0F, 0F, 0F, 1, 6, 20, 0F); // Box 8
			bodyModel[145].setRotationPoint(19F, -27F, -10F);

			bodyModel[146].addBox(0F, 0F, 0F, 1, 20, 7, 0F); // Box 8
			bodyModel[146].setRotationPoint(19F, -21F, -10F);

			bodyModel[147].addBox(0F, 0F, 0F, 1, 20, 7, 0F); // Box 8
			bodyModel[147].setRotationPoint(19F, -21F, 3F);
	}


	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	private ModelRendererTurbo pullmanspalaceModel[];
}