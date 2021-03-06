import org.junit.Test;

public class TestExamples extends AbstractTestExamples {

  @Test
  public void testAbstractClasses() {
    testExample("Examples/Abstract/AbstractClasses.kt", abstractcasses.AbstractClassesKt::main);
  }

  @Test
  public void testAuxiliaryInitialization() {
    testExample("Examples/BaseInit/AuxiliaryInitialization.kt", baseclassinit.AuxiliaryInitializationKt::main);
  }

  @Test
  public void testCallOtherConstructors() {
    testExample("Examples/BaseInit/CallOtherConstructors.kt", baseclassinit.CallOtherConstructorsKt::main);
  }

  @Test
  public void testGreatApe2() {
    testExample("Examples/BaseInit/GreatApe2.kt", baseclassinit.GreatApe2Kt::main);
  }

  @Test
  public void testBooleans1() {
    testExample("Examples/Booleans/Booleans1.kt", Booleans1Kt::main);
  }

  @Test
  public void testBooleans2() {
    testExample("Examples/Booleans/Booleans2.kt", Booleans2Kt::main);
  }

  @Test
  public void testBooleans3() {
    testExample("Examples/Booleans/Booleans3.kt", Booleans3Kt::main);
  }

  @Test
  public void testEvaluationOrder() {
    testExample("Examples/Booleans/EvaluationOrder.kt", EvaluationOrderKt::main);
  }

  @Test
  public void testClassArg() {
    testExample("Examples/ClassArguments/ClassArg.kt", ClassArgKt::main);
  }

  @Test
  public void testGoodAlien() {
    testExample("Examples/ClassArguments/GoodAlien.kt", GoodAlienKt::main);
  }

  @Test
  public void testMultipleClassArgs() {
    testExample("Examples/ClassArguments/MultipleClassArgs.kt", MultipleClassArgsKt::main);
  }

  @Test
  public void testPrintAlienSpieces() {
    testExample("Examples/ClassArguments/PrintAlienSpieces.kt", PrintAlienSpiecesKt::main);
  }

  @Test
  public void testVisibleClassArgs() {
    testExample("Examples/ClassArguments/VisibleClassArgs.kt", VisibleClassArgsKt::main);
  }

  @Test
  public void testDelegatedControls() {
    testExample("Examples/ClassDelegation/DelegatedControls.kt", DelegatedControlsKt::main);
  }

  @Test
  public void testExplicitDelegation() {
    testExample("Examples/ClassDelegation/ExplicitDelegation.kt", ExplicitDelegationKt::main);
  }

  @Test
  public void testModelingMI() {
    testExample("Examples/ClassDelegation/ModelingMI.kt", ModelingMIKt::main);
  }

  @Test
  public void testHiddenArrayList() {
    testExample("Examples/CollectionsAndJava/HiddenArrayList.kt", HiddenArrayListKt::main);
  }

  @Test
  public void testJavaList() {
    testExample("Examples/CollectionsAndJava/JavaList.kt", JavaListKt::main);
  }

  @Test
  public void testReadOnlyCollections() {
    testExample("Examples/CollectionsAndJava/ReadOnlyCollections.kt", ReadOnlyCollectionsKt::main);
  }

  @Test
  public void testMultiLineComment() {
    testExample("Examples/Comments/MultiLineComment.kt", MultiLineCommentKt::main);
  }

  @Test
  public void testSingleLineComment() {
    testExample("Examples/Comments/SingleLineComment.kt", SingleLineCommentKt::main);
  }

  @Test
  public void testCompanionFactory() {
    testExample("Examples/Companions/CompanionFactory.kt", companions.CompanionFactoryKt::main);
  }

  @Test
  public void testCompanionObject() {
    testExample("Examples/Companions/CompanionObject.kt", CompanionObjectKt::main);
  }

  @Test
  public void testNamedCompanionObject() {
    testExample("Examples/Companions/NamedCompanionObject.kt", NamedCompanionObjectKt::main);
  }

  @Test
  public void testObjectCounter() {
    testExample("Examples/Companions/ObjectCounter.kt", ObjectCounterKt::main);
  }

  @Test
  public void testObjectFunctions() {
    testExample("Examples/Companions/ObjectFunctions.kt", ObjectFunctionsKt::main);
  }

  @Test
  public void testObjectProperty() {
    testExample("Examples/Companions/ObjectProperty.kt", ObjectPropertyKt::main);
  }

  @Test
  public void testCoffee() {
    testExample("Examples/Constructors/Coffee.kt", CoffeeKt::main);
  }

  @Test
  public void testInitSection() {
    testExample("Examples/Constructors/InitSection.kt", constructors.InitSectionKt::main);
  }

  @Test
  public void testCompareDelayingTask() {
    testExample("Examples/Coroutines/CompareDelayingTask.kt", CompareDelayingTaskKt::main);
  }

  @Test
  public void testCompareSlowFib() {
    testExample("Examples/Coroutines/CompareSlowFib.kt", CompareSlowFibKt::main);
  }

  @Test
  public void testFibonacciSequence() {
    testExample("Examples/Coroutines/FibonacciSequence.kt", FibonacciSequenceKt::main);
  }

  @Test
  public void testHelloCoroutines() {
    testExample("Examples/Coroutines/HelloCoroutines.kt", HelloCoroutinesKt::main);
  }

  @Test
  public void testLazySequence() {
    testExample("Examples/Coroutines/LazySequence.kt", LazySequenceKt::main);
  }

  @Test
  public void testAnimals() {
    testExample("Examples/CreatingClasses/Animals.kt", AnimalsKt::main);
  }

  @Test
  public void testCat() {
    testExample("Examples/CreatingClasses/Cat.kt", CatKt::main);
  }

  @Test
  public void testDog() {
    testExample("Examples/CreatingClasses/Dog.kt", DogKt::main);
  }

  @Test
  public void testHamster() {
    testExample("Examples/CreatingClasses/Hamster.kt", HamsterKt::main);
  }

  @Test
  public void testCopyDataClass() {
    testExample("Examples/DataClasses/CopyDataClass.kt", CopyDataClassKt::main);
  }

  @Test
  public void testDataClasses() {
    testExample("Examples/DataClasses/DataClasses.kt", dataclasses.DataClassesKt::main);
  }

  @Test
  public void testSimple() {
    testExample("Examples/DataClasses/Simple.kt", SimpleKt::main);
  }

  @Test
  public void testInference() {
    testExample("Examples/DataTypes/Inference.kt", InferenceKt::main);
  }

  @Test
  public void testStringPlusNumber() {
    testExample("Examples/DataTypes/StringPlusNumber.kt", StringPlusNumberKt::main);
  }

  @Test
  public void testTypes() {
    testExample("Examples/DataTypes/Types.kt", TypesKt::main);
  }

  @Test
  public void testComputationResult() {
    testExample("Examples/Destructuring/ComputationResult.kt", ComputationResultKt::main);
  }

  @Test
  public void testForLoop() {
    testExample("Examples/Destructuring/ForLoop.kt", ForLoopKt::main);
  }

  @Test
  public void testPairDestructuring() {
    testExample("Examples/Destructuring/PairDestructuring.kt", PairDestructuringKt::main);
  }

  @Test
  public void testPairs() {
    testExample("Examples/Destructuring/Pairs.kt", PairsKt::main);
  }

  @Test
  public void testTuple() {
    testExample("Examples/Destructuring/Tuple.kt", destructuring.TupleKt::main);
  }

  @Test
  public void testElvisCall() {
    testExample("Examples/Elvis/ElvisCall.kt", ElvisCallKt::main);
  }

  @Test
  public void testElvisOperator() {
    testExample("Examples/Elvis/ElvisOperator.kt", ElvisOperatorKt::main);
  }

  @Test
  public void testEnumImport() {
    testExample("Examples/Enumerations/EnumImport.kt", EnumImportKt::main);
  }

  @Test
  public void testImportLevel() {
    testExample("Examples/Enumerations/ImportLevel.kt", ImportLevelKt::main);
  }

  @Test
  public void testLevel() {
    testExample("Examples/Enumerations/Level.kt", enumerations.LevelKt::main);
  }

  @Test
  public void testRecursiveEnumImport() {
    testExample("Examples/Enumerations/RecursiveEnumImport.kt", enumerations.RecursiveEnumImportKt::main);
  }

  @Test
  public void testCleanup() {
    testExample("Examples/ErrorReporting/Cleanup.kt", CleanupKt::main);
  }

  @Test
  public void testCleanup2() {
    testExample("Examples/ErrorReporting/Cleanup2.kt", Cleanup2Kt::main);
  }

  @Test
  public void testElvisWithException() {
    testExample("Examples/ErrorReporting/ElvisWithException.kt", ElvisWithExceptionKt::main);
  }

  @Test
  public void testForEachLine() {
    testExample("Examples/ErrorReporting/ForEachLine.kt", ForEachLineKt::main);
  }

  @Test
  public void testLet() {
    testExample("Examples/ErrorReporting/Let.kt", LetKt::main);
  }

  @Test
  public void testPostconditions() {
    testExample("Examples/ErrorReporting/Postconditions.kt", PostconditionsKt::main);
  }

  @Test
  public void testReadTraceFile() {
    testExample("Examples/ErrorReporting/ReadTraceFile.kt", ReadTraceFileKt::main);
  }

  @Test
  public void testRequireNotNull() {
    testExample("Examples/ErrorReporting/RequireNotNull.kt", RequireNotNullKt::main);
  }

  @Test
  public void testSTUB() {
    testExample("Examples/ErrorReporting/STUB.kt", STUBKt::main);
  }

  @Test
  public void testUsable() {
    testExample("Examples/ErrorReporting/Usable.kt", UsableKt::main);
  }

  @Test
  public void testUsingTODO() {
    testExample("Examples/ErrorReporting/UsingTODO.kt", UsingTODOKt::main);
  }

  @Test
  public void testConversionFailure() {
    testExample("Examples/ExceptionHandling/ConversionFailure.kt", ConversionFailureKt::main);
  }

  @Test
  public void testDefiningExceptions() {
    testExample("Examples/ExceptionHandling/DefiningExceptions.kt", toss.DefiningExceptionsKt::main);
  }

  @Test
  public void testExceptionHandlers() {
    testExample("Examples/ExceptionHandling/ExceptionHandlers.kt", toss.ExceptionHandlersKt::main);
  }

  @Test
  public void testGuaranteedCleanup() {
    testExample("Examples/ExceptionHandling/GuaranteedCleanup.kt", GuaranteedCleanupKt::main);
  }

  @Test
  public void testInputCheck() {
    testExample("Examples/ExceptionHandling/InputCheck.kt", InputCheckKt::main);
  }

  @Test
  public void testKotlinCheckedExceptions() {
    testExample("Examples/ExceptionHandling/KotlinCheckedExceptions.kt", KotlinCheckedExceptionsKt::main);
  }

  @Test
  public void testTryFinally() {
    testExample("Examples/ExceptionHandling/TryFinally.kt", TryFinallyKt::main);
  }

  @Test
  public void testAverageIncome() {
    testExample("Examples/Exceptions/AverageIncome.kt", firstVersion.AverageIncomeKt::main);
  }

  @Test
  public void testAverageIncomeWithException() {
    testExample("Examples/Exceptions/AverageIncomeWithException.kt", properException.AverageIncomeWithExceptionKt::main);
  }

  @Test
  public void testAverageIncomeWithNull() {
    testExample("Examples/Exceptions/AverageIncomeWithNull.kt", withNull.AverageIncomeWithNullKt::main);
  }

  @Test
  public void testIntroducingCapture() {
    testExample("Examples/Exceptions/IntroducingCapture.kt", IntroducingCaptureKt::main);
  }

  @Test
  public void testIntroducingNull() {
    testExample("Examples/Exceptions/IntroducingNull.kt", IntroducingNullKt::main);
  }

  @Test
  public void testToIntException() {
    testExample("Examples/Exceptions/ToIntException.kt", ToIntExceptionKt::main);
  }

  @Test
  public void testToIntException2() {
    testExample("Examples/Exceptions/ToIntException2.kt", ToIntException2Kt::main);
  }

  @Test
  public void testAssigningAnIf() {
    testExample("Examples/ExpressionsAndStatements/AssigningAnIf.kt", AssigningAnIfKt::main);
  }

  @Test
  public void testConfusingOperator() {
    testExample("Examples/ExpressionsAndStatements/ConfusingOperator.kt", ConfusingOperatorKt::main);
  }

  @Test
  public void testForIsAStatement() {
    testExample("Examples/ExpressionsAndStatements/ForIsAStatement.kt", ForIsAStatementKt::main);
  }

  @Test
  public void testPostfixVsPrefix() {
    testExample("Examples/ExpressionsAndStatements/PostfixVsPrefix.kt", PostfixVsPrefixKt::main);
  }

  @Test
  public void testUnitReturnType() {
    testExample("Examples/ExpressionsAndStatements/UnitReturnType.kt", UnitReturnTypeKt::main);
  }

  @Test
  public void testBookExtensions() {
    testExample("Examples/Extensions/BookExtensions.kt", BookExtensionsKt::main);
  }

  @Test
  public void testMemberVsExtension() {
    testExample("Examples/Extensions/MemberVsExtension.kt", MemberVsExtensionKt::main);
  }

  @Test
  public void testQuote() {
    testExample("Examples/Extensions/Quote.kt", other.QuoteKt::main);
  }

  @Test
  public void testQuoting() {
    testExample("Examples/Extensions/Quoting.kt", quoting.QuotingKt::main);
  }

  @Test
  public void testStrangeQuote() {
    testExample("Examples/Extensions/StrangeQuote.kt", StrangeQuoteKt::main);
  }

  @Test
  public void testAddingIntToChar() {
    testExample("Examples/ForAndRanges/AddingIntToChar.kt", AddingIntToCharKt::main);
  }

  @Test
  public void testDefiningRanges() {
    testExample("Examples/ForAndRanges/DefiningRanges.kt", DefiningRangesKt::main);
  }

  @Test
  public void testForWithCharRange() {
    testExample("Examples/ForAndRanges/ForWithCharRange.kt", ForWithCharRangeKt::main);
  }

  @Test
  public void testForWithRanges() {
    testExample("Examples/ForAndRanges/ForWithRanges.kt", ForWithRangesKt::main);
  }

  @Test
  public void testHasChar() {
    testExample("Examples/ForAndRanges/HasChar.kt", HasCharKt::main);
  }

  @Test
  public void testIndexIntoString() {
    testExample("Examples/ForAndRanges/IndexIntoString.kt", IndexIntoStringKt::main);
  }

  @Test
  public void testIterateOverString() {
    testExample("Examples/ForAndRanges/IterateOverString.kt", IterateOverStringKt::main);
  }

  @Test
  public void testRepeat() {
    testExample("Examples/ForAndRanges/Repeat.kt", RepeatKt::main);
  }

  @Test
  public void testRepeatThreeTimes() {
    testExample("Examples/ForAndRanges/RepeatThreeTimes.kt", RepeatThreeTimesKt::main);
  }

  @Test
  public void testSumUsingRange() {
    testExample("Examples/ForAndRanges/SumUsingRange.kt", SumUsingRangeKt::main);
  }

  @Test
  public void testExtensionsToJavaClass() {
    testExample("Examples/FromKotlin/ExtensionsToJavaClass.kt", FromKotlin.ExtensionsToJavaClassKt::main);
  }

  @Test
  public void testRandom() {
    testExample("Examples/FromKotlin/Random.kt", RandomKt::main);
  }

  @Test
  public void testUseBeanClass() {
    testExample("Examples/FromKotlin/UseBeanClass.kt", UseBeanClassKt::main);
  }

  @Test
  public void testMultiplyByFour() {
    testExample("Examples/Functions/MultiplyByFour.kt", MultiplyByFourKt::main);
  }

  @Test
  public void testMultiplyByThree() {
    testExample("Examples/Functions/MultiplyByThree.kt", MultiplyByThreeKt::main);
  }

  @Test
  public void testMultiplyByTwo() {
    testExample("Examples/Functions/MultiplyByTwo.kt", MultiplyByTwoKt::main);
  }

  @Test
  public void testSayHello() {
    testExample("Examples/Functions/SayHello.kt", SayHelloKt::main);
  }

  @Test
  public void testAnyInstead() {
    testExample("Examples/Generics/AnyInstead.kt", generics.AnyInsteadKt::main);
  }

  @Test
  public void testBasicGenerics() {
    testExample("Examples/Generics/BasicGenerics.kt", generics.BasicGenericsKt::main);
  }

  @Test
  public void testGenericHolder() {
    testExample("Examples/Generics/GenericHolder.kt", generics.GenericHolderKt::main);
  }

  @Test
  public void testGenericSpeakers() {
    testExample("Examples/Generics/GenericSpeakers.kt", generics.GenericSpeakersKt::main);
  }

  @Test
  public void testGenericVsAny() {
    testExample("Examples/Generics/GenericVsAny.kt", generics.GenericVsAnyKt::main);
  }

  @Test
  public void testHolder() {
    testExample("Examples/Generics/Holder.kt", generics.HolderKt::main);
  }

  @Test
  public void testPerform() {
    testExample("Examples/Generics/Perform.kt", generics.PerformKt::main);
  }

  @Test
  public void testRandomList() {
    testExample("Examples/Generics/RandomList.kt", RandomListKt::main);
  }

  @Test
  public void testSpeakers() {
    testExample("Examples/Generics/Speakers.kt", generics.SpeakersKt::main);
  }

  @Test
  public void testEasyKeys() {
    testExample("Examples/Hashing/EasyKeys.kt", hashing.EasyKeysKt::main);
  }

  @Test
  public void testHashCodeFailure() {
    testExample("Examples/Hashing/HashCodeFailure.kt", HashCodeFailureKt::main);
  }

  @Test
  public void testKeyFailure() {
    testExample("Examples/Hashing/KeyFailure.kt", KeyFailureKt::main);
  }

  @Test
  public void testPets() {
    testExample("Examples/Hashing/Pets.kt", hashing.PetsKt::main);
  }

  @Test
  public void testSimpleHashing() {
    testExample("Examples/Hashing/SimpleHashing.kt", SimpleHashingKt::main);
  }

  @Test
  public void testStringHashCode() {
    testExample("Examples/Hashing/StringHashCode.kt", StringHashCodeKt::main);
  }

  @Test
  public void testUnpredictableHashing() {
    testExample("Examples/Hashing/UnpredictableHashing.kt", UnpredictableHashingKt::main);
  }

  @Test
  public void testEmptyProgram() {
    testExample("Examples/HelloWorld/EmptyProgram.kt", EmptyProgramKt::main);
  }

  @Test
  public void testHelloWorld() {
    testExample("Examples/HelloWorld/HelloWorld.kt", HelloWorldKt::main);
  }

  @Test
  public void testIf1() {
    testExample("Examples/IfExpressions/If1.kt", If1Kt::main);
  }

  @Test
  public void testIf2() {
    testExample("Examples/IfExpressions/If2.kt", If2Kt::main);
  }

  @Test
  public void testIf3() {
    testExample("Examples/IfExpressions/If3.kt", If3Kt::main);
  }

  @Test
  public void testIf4() {
    testExample("Examples/IfExpressions/If4.kt", If4Kt::main);
  }

  @Test
  public void testIf5() {
    testExample("Examples/IfExpressions/If5.kt", If5Kt::main);
  }

  @Test
  public void testIf6() {
    testExample("Examples/IfExpressions/If6.kt", If6Kt::main);
  }

  @Test
  public void testOneOrTheOther() {
    testExample("Examples/IfExpressions/OneOrTheOther.kt", OneOrTheOtherKt::main);
  }

  @Test
  public void testTrueOrFalse() {
    testExample("Examples/IfExpressions/TrueOrFalse.kt", TrueOrFalseKt::main);
  }

  @Test
  public void testColorBlendMap2() {
    testExample("Examples/Immutability/ColorBlendMap2.kt", immutability.ColorBlendMap2Kt::main);
  }

  @Test
  public void testDataClassCopy() {
    testExample("Examples/Immutability/DataClassCopy.kt", DataClassCopyKt::main);
  }

  @Test
  public void testWhyFlatMap() {
    testExample("Examples/Immutability/WhyFlatMap.kt", immutability.WhyFlatMapKt::main);
  }

  @Test
  public void testEvenFilter() {
    testExample("Examples/ImportanceOfLambdas/EvenFilter.kt", EvenFilterKt::main);
  }

  @Test
  public void testFilter() {
    testExample("Examples/ImportanceOfLambdas/Filter.kt", FilterKt::main);
  }

  @Test
  public void testGreaterThan2() {
    testExample("Examples/ImportanceOfLambdas/GreaterThan2.kt", GreaterThan2Kt::main);
  }

  @Test
  public void testLambdaAsReference() {
    testExample("Examples/ImportanceOfLambdas/LambdaAsReference.kt", importanceoflambdas.LambdaAsReferenceKt::main);
  }

  @Test
  public void testLambdaReference() {
    testExample("Examples/ImportanceOfLambdas/LambdaReference.kt", LambdaReferenceKt::main);
  }

  @Test
  public void testFullyQualify() {
    testExample("Examples/ImportsAndPackages/FullyQualify.kt", FullyQualifyKt::main);
  }

  @Test
  public void testImportClass() {
    testExample("Examples/ImportsAndPackages/ImportClass.kt", ImportClassKt::main);
  }

  @Test
  public void testImportEverything() {
    testExample("Examples/ImportsAndPackages/ImportEverything.kt", ImportEverythingKt::main);
  }

  @Test
  public void testImportNameChange() {
    testExample("Examples/ImportsAndPackages/ImportNameChange.kt", ImportNameChangeKt::main);
  }

  @Test
  public void testImportPythagorean() {
    testExample("Examples/ImportsAndPackages/ImportPythagorean.kt", ImportPythagoreanKt::main);
  }

  @Test
  public void testGreatApe() {
    testExample("Examples/Inheritance/GreatApe.kt", inheritance.GreatApeKt::main);
  }

  @Test
  public void testAdder() {
    testExample("Examples/Interfaces/Adder.kt", interfaces.AdderKt::main);
  }

  @Test
  public void testInterfaceCollision() {
    testExample("Examples/Interfaces/InterfaceCollision.kt", InterfaceCollisionKt::main);
  }

  @Test
  public void testMemberImplementations() {
    testExample("Examples/Interfaces/MemberImplementations.kt", interfaces4.MemberImplementationsKt::main);
  }

  @Test
  public void testPropertyInInterface() {
    testExample("Examples/Interfaces/PropertyInInterface.kt", interfaces.PropertyInInterfaceKt::main);
  }

  @Test
  public void testStateOfAClass() {
    testExample("Examples/Interfaces/StateOfAClass.kt", StateOfAClassKt::main);
  }

  @Test
  public void testAnonymousFunction() {
    testExample("Examples/Lambdas/AnonymousFunction.kt", AnonymousFunctionKt::main);
  }

  @Test
  public void testAssignAnonymous() {
    testExample("Examples/Lambdas/AssignAnonymous.kt", AssignAnonymousKt::main);
  }

  @Test
  public void testCallLater() {
    testExample("Examples/Lambdas/CallLater.kt", CallLaterKt::main);
  }

  @Test
  public void testDisplayDuck() {
    testExample("Examples/Lambdas/DisplayDuck.kt", DisplayDuckKt::main);
  }

  @Test
  public void testDuckForEach() {
    testExample("Examples/Lambdas/DuckForEach.kt", DuckForEachKt::main);
  }

  @Test
  public void testFormatLambda() {
    testExample("Examples/Lambdas/FormatLambda.kt", FormatLambdaKt::main);
  }

  @Test
  public void testFormatList() {
    testExample("Examples/Lambdas/FormatList.kt", FormatListKt::main);
  }

  @Test
  public void testFormatListWithLambda() {
    testExample("Examples/Lambdas/FormatListWithLambda.kt", FormatListWithLambdaKt::main);
  }

  @Test
  public void testLambdaIt() {
    testExample("Examples/Lambdas/LambdaIt.kt", LambdaItKt::main);
  }

  @Test
  public void testLambdaTypeInference() {
    testExample("Examples/Lambdas/LambdaTypeInference.kt", LambdaTypeInferenceKt::main);
  }

  @Test
  public void testListOperations() {
    testExample("Examples/Lambdas/ListOperations.kt", ListOperationsKt::main);
  }

  @Test
  public void testMapUnpacking() {
    testExample("Examples/Lambdas/MapUnpacking.kt", MapUnpackingKt::main);
  }

  @Test
  public void testTwoArgLambda() {
    testExample("Examples/Lambdas/TwoArgLambda.kt", TwoArgLambdaKt::main);
  }

  @Test
  public void testUnderscore() {
    testExample("Examples/Lambdas/Underscore.kt", UnderscoreKt::main);
  }

  @Test
  public void testBasic() {
    testExample("Examples/LambdaWithReceiver/Basic.kt", lambdawithreceiver.BasicKt::main);
  }

  @Test
  public void testExtensions() {
    testExample("Examples/LambdaWithReceiver/Extensions.kt", lambdawithreceiver.ExtensionsKt::main);
  }

  @Test
  public void testFunctionLiterals() {
    testExample("Examples/LambdaWithReceiver/FunctionLiterals.kt", lambdawithreceiver.FunctionLiteralsKt::main);
  }

  @Test
  public void testSyntax() {
    testExample("Examples/LambdaWithReceiver/Syntax.kt", SyntaxKt::main);
  }

  @Test
  public void testTestClass() {
    testExample("Examples/LambdaWithReceiver/TestClass.kt", lambdawithreceiver.TestClassKt::main);
  }

  @Test
  public void testUseLater() {
    testExample("Examples/LambdaWithReceiver/UseLater.kt", lambdawithreceiver.UseLaterKt::main);
  }

  @Test
  public void testWithReceiver() {
    testExample("Examples/LambdaWithReceiver/WithReceiver.kt", lambdawithreceiver.WithReceiverKt::main);
  }

  @Test
  public void testBetterSuitcase() {
    testExample("Examples/LateInitialization/BetterSuitcase.kt", BetterSuitcaseKt::main);
  }

  @Test
  public void testFaultySuitcase() {
    testExample("Examples/LateInitialization/FaultySuitcase.kt", FaultySuitcaseKt::main);
  }

  @Test
  public void testSuitcase() {
    testExample("Examples/LateInitialization/Suitcase.kt", SuitcaseKt::main);
  }

  @Test
  public void testLazyInt() {
    testExample("Examples/LazyInitialization/LazyInt.kt", LazyIntKt::main);
  }

  @Test
  public void testLazySyntax() {
    testExample("Examples/LazyInitialization/LazySyntax.kt", lazyinitialization.LazySyntaxKt::main);
  }

  @Test
  public void testPropertyOptions() {
    testExample("Examples/LazyInitialization/PropertyOptions.kt", lazyinitialization.PropertyOptionsKt::main);
  }

  @Test
  public void testDisplayListBlemish() {
    testExample("Examples/ListOperations/DisplayListBlemish.kt", DisplayListBlemishKt::main);
  }

  @Test
  public void testDisplayListMap() {
    testExample("Examples/ListOperations/DisplayListMap.kt", DisplayListMapKt::main);
  }

  @Test
  public void testMoreReduce() {
    testExample("Examples/ListOperations/MoreReduce.kt", MoreReduceKt::main);
  }

  @Test
  public void testReduce() {
    testExample("Examples/ListOperations/Reduce.kt", ReduceKt::main);
  }

  @Test
  public void testSimpleMap() {
    testExample("Examples/ListOperations/SimpleMap.kt", SimpleMapKt::main);
  }

  @Test
  public void testLists() {
    testExample("Examples/Lists/Lists.kt", ListsKt::main);
  }

  @Test
  public void testListUsefulFunction() {
    testExample("Examples/Lists/ListUsefulFunction.kt", ListUsefulFunctionKt::main);
  }

  @Test
  public void testMultipleListRefs() {
    testExample("Examples/Lists/MultipleListRefs.kt", readonlyandmutable.MultipleListRefsKt::main);
  }

  @Test
  public void testMutableList() {
    testExample("Examples/Lists/MutableList.kt", MutableListKt::main);
  }

  @Test
  public void testMutListIsList() {
    testExample("Examples/Lists/MutListIsList.kt", readonlyandmutable.MutListIsListKt::main);
  }

  @Test
  public void testOutOfBounds() {
    testExample("Examples/Lists/OutOfBounds.kt", OutOfBoundsKt::main);
  }

  @Test
  public void testParameterizedReturn() {
    testExample("Examples/Lists/ParameterizedReturn.kt", parameterizedtypes.ParameterizedReturnKt::main);
  }

  @Test
  public void testParameterizedTypes() {
    testExample("Examples/Lists/ParameterizedTypes.kt", parameterizedtypes.ParameterizedTypesKt::main);
  }

  @Test
  public void testLocalExtensions() {
    testExample("Examples/LocalFunctions/LocalExtensions.kt", LocalExtensionsKt::main);
  }

  @Test
  public void testLocalFunctions() {
    testExample("Examples/LocalFunctions/LocalFunctions.kt", LocalFunctionsKt::main);
  }

  @Test
  public void testBasicLogging() {
    testExample("Examples/Logging/BasicLogging.kt", logging.BasicLoggingKt::main);
  }

  @Test
  public void testSimpleLoggingStrategy() {
    testExample("Examples/Logging/SimpleLoggingStrategy.kt", logging.SimpleLoggingStrategyKt::main);
  }

  @Test
  public void testUseAtomicLog() {
    testExample("Examples/Logging/UseAtomicLog.kt", UseAtomicLogKt::main);
  }

  @Test
  public void testContactMap() {
    testExample("Examples/Maps/ContactMap.kt", ContactMapKt::main);
  }

  @Test
  public void testGetValue() {
    testExample("Examples/Maps/GetValue.kt", GetValueKt::main);
  }

  @Test
  public void testMaps() {
    testExample("Examples/Maps/Maps.kt", MapsKt::main);
  }

  @Test
  public void testMutableMaps() {
    testExample("Examples/Maps/MutableMaps.kt", MutableMapsKt::main);
  }

  @Test
  public void testReadOnlyMaps() {
    testExample("Examples/Maps/ReadOnlyMaps.kt", ReadOnlyMapsKt::main);
  }

  @Test
  public void testCharRange() {
    testExample("Examples/MoreAboutRanges/CharRange.kt", CharRangeKt::main);
  }

  @Test
  public void testFloatingPointRange() {
    testExample("Examples/MoreAboutRanges/FloatingPointRange.kt", FloatingPointRangeKt::main);
  }

  @Test
  public void testInString() {
    testExample("Examples/MoreAboutRanges/InString.kt", InStringKt::main);
  }

  @Test
  public void testIterationVsMembership() {
    testExample("Examples/MoreAboutRanges/IterationVsMembership.kt", IterationVsMembershipKt::main);
  }

  @Test
  public void testMembershipInRange() {
    testExample("Examples/MoreAboutRanges/MembershipInRange.kt", MembershipInRangeKt::main);
  }

  @Test
  public void testMembershipUsingBounds() {
    testExample("Examples/MoreAboutRanges/MembershipUsingBounds.kt", MembershipUsingBoundsKt::main);
  }

  @Test
  public void testStringRange() {
    testExample("Examples/MoreAboutRanges/StringRange.kt", StringRangeKt::main);
  }

  @Test
  public void testColorBlendMap() {
    testExample("Examples/MoreAboutWhen/ColorBlendMap.kt", colorblendmap.ColorBlendMapKt::main);
  }

  @Test
  public void testColorBlendTest() {
    testExample("Examples/MoreAboutWhen/ColorBlendTest.kt", colorblendtest.ColorBlendTestKt::main);
  }

  @Test
  public void testArgumentOrder() {
    testExample("Examples/NamedAndDefaultArgs/ArgumentOrder.kt", ArgumentOrderKt::main);
  }

  @Test
  public void testNamedAndDefaultArgs() {
    testExample("Examples/NamedAndDefaultArgs/NamedAndDefaultArgs.kt", NamedAndDefaultArgsKt::main);
  }

  @Test
  public void testNamedArguments() {
    testExample("Examples/NamedAndDefaultArgs/NamedArguments.kt", NamedArgumentsKt::main);
  }

  @Test
  public void testNonNullAssert() {
    testExample("Examples/NonNullAsserts/NonNullAssert.kt", NonNullAssertKt::main);
  }

  @Test
  public void testNonNullAssertCall() {
    testExample("Examples/NonNullAsserts/NonNullAssertCall.kt", NonNullAssertCallKt::main);
  }

  @Test
  public void testValueFromMap() {
    testExample("Examples/NonNullAsserts/ValueFromMap.kt", ValueFromMapKt::main);
  }

  @Test
  public void testAnnotatedJava() {
    testExample("Examples/NullabilityAnnotations/AnnotatedJava.kt", usingannotatedtypes.AnnotatedJavaKt::main);
  }

  @Test
  public void testDereference() {
    testExample("Examples/Nullable/Dereference.kt", DereferenceKt::main);
  }

  @Test
  public void testExplicitCheck() {
    testExample("Examples/Nullable/ExplicitCheck.kt", ExplicitCheckKt::main);
  }

  @Test
  public void testNullableTypes() {
    testExample("Examples/Nullable/NullableTypes.kt", NullableTypesKt::main);
  }

  @Test
  public void testNullInMaps() {
    testExample("Examples/Nullable/NullInMaps.kt", NullInMapsKt::main);
  }

  @Test
  public void testDefinition() {
    testExample("Examples/NullableExtensions/Definition.kt", DefinitionKt::main);
  }

  @Test
  public void testRemoveNulls() {
    testExample("Examples/NullableExtensions/RemoveNulls.kt", RemoveNullsKt::main);
  }

  @Test
  public void testStringIsNullOr() {
    testExample("Examples/NullableExtensions/StringIsNullOr.kt", StringIsNullOrKt::main);
  }

  @Test
  public void testNPEOnPlatformType() {
    testExample("Examples/NullableTypesAndJava/NPEOnPlatformType.kt", NPEOnPlatformTypeKt::main);
  }

  @Test
  public void testPlatformTypes() {
    testExample("Examples/NullableTypesAndJava/PlatformTypes.kt", PlatformTypesKt::main);
  }

  @Test
  public void testBiggestLong() {
    testExample("Examples/NumberTypes/BiggestLong.kt", BiggestLongKt::main);
  }

  @Test
  public void testBMI() {
    testExample("Examples/NumberTypes/BMI.kt", BMIKt::main);
  }

  @Test
  public void testInferInt() {
    testExample("Examples/NumberTypes/InferInt.kt", InferIntKt::main);
  }

  @Test
  public void testIntDivisionTruncates() {
    testExample("Examples/NumberTypes/IntDivisionTruncates.kt", IntDivisionTruncatesKt::main);
  }

  @Test
  public void testIntegerMath() {
    testExample("Examples/NumberTypes/IntegerMath.kt", IntegerMathKt::main);
  }

  @Test
  public void testIntegerOverflow() {
    testExample("Examples/NumberTypes/IntegerOverflow.kt", IntegerOverflowKt::main);
  }

  @Test
  public void testLongConstants() {
    testExample("Examples/NumberTypes/LongConstants.kt", LongConstantsKt::main);
  }

  @Test
  public void testModulus() {
    testExample("Examples/NumberTypes/Modulus.kt", ModulusKt::main);
  }

  @Test
  public void testUsingLongs() {
    testExample("Examples/NumberTypes/UsingLongs.kt", UsingLongsKt::main);
  }

  @Test
  public void testObjectInheritance() {
    testExample("Examples/Objects/ObjectInheritance.kt", ObjectInheritanceKt::main);
  }

  @Test
  public void testObjectKeyword() {
    testExample("Examples/Objects/ObjectKeyword.kt", ObjectKeywordKt::main);
  }

  @Test
  public void testObjectNesting() {
    testExample("Examples/Objects/ObjectNesting.kt", ObjectNestingKt::main);
  }

  @Test
  public void testIntRanges() {
    testExample("Examples/ObjectsEverywhere/IntRanges.kt", IntRangesKt::main);
  }

  @Test
  public void testNumberConversions() {
    testExample("Examples/ObjectsEverywhere/NumberConversions.kt", NumberConversionsKt::main);
  }

  @Test
  public void testRangeSum() {
    testExample("Examples/ObjectsEverywhere/RangeSum.kt", RangeSumKt::main);
  }

  @Test
  public void testStringAndNumberConversion() {
    testExample("Examples/ObjectsEverywhere/StringAndNumberConversion.kt", StringAndNumberConversionKt::main);
  }

  @Test
  public void testStrings() {
    testExample("Examples/ObjectsEverywhere/Strings.kt", StringsKt::main);
  }

  @Test
  public void testAllOperators() {
    testExample("Examples/Operators/AllOperators.kt", operators.AllOperatorsKt::main);
  }

  @Test
  public void testBackticks() {
    testExample("Examples/Operators/Backticks.kt", BackticksKt::main);
  }

  @Test
  public void testInvoke() {
    testExample("Examples/Operators/Invoke.kt", InvokeKt::main);
  }

  @Test
  public void testMemberOperator() {
    testExample("Examples/Operators/MemberOperator.kt", operators.MemberOperatorKt::main);
  }

  @Test
  public void testMolecule() {
    testExample("Examples/Operators/Molecule.kt", MoleculeKt::main);
  }

  @Test
  public void testNum() {
    testExample("Examples/Operators/Num.kt", operators.NumKt::main);
  }

  @Test
  public void testStringInvoke() {
    testExample("Examples/Operators/StringInvoke.kt", StringInvokeKt::main);
  }

  @Test
  public void testSwearing() {
    testExample("Examples/Operators/Swearing.kt", SwearingKt::main);
  }

  @Test
  public void testOverloading() {
    testExample("Examples/Overloading/Overloading.kt", OverloadingKt::main);
  }

  @Test
  public void testOverloadingAdd() {
    testExample("Examples/Overloading/OverloadingAdd.kt", OverloadingAddKt::main);
  }

  @Test
  public void testWithDefaultArguments() {
    testExample("Examples/Overloading/WithDefaultArguments.kt", WithDefaultArgumentsKt::main);
  }

  @Test
  public void testWithoutDefaultArguments() {
    testExample("Examples/Overloading/WithoutDefaultArguments.kt", WithoutDefaultArgumentsKt::main);
  }

  @Test
  public void testGreatApe3() {
    testExample("Examples/Overriding/GreatApe3.kt", GreatApe3Kt::main);
  }

  @Test
  public void testFantasyGame() {
    testExample("Examples/Polymorphism/FantasyGame.kt", polymorphism.FantasyGameKt::main);
  }

  @Test
  public void testAnUnchangingVar() {
    testExample("Examples/Properties/AnUnchangingVar.kt", AnUnchangingVarKt::main);
  }

  @Test
  public void testChangingAVal() {
    testExample("Examples/Properties/ChangingAVal.kt", ChangingAValKt::main);
  }

  @Test
  public void testCup() {
    testExample("Examples/Properties/Cup.kt", CupKt::main);
  }

  @Test
  public void testCup2() {
    testExample("Examples/Properties/Cup2.kt", Cup2Kt::main);
  }

  @Test
  public void testReferences() {
    testExample("Examples/Properties/References.kt", ReferencesKt::main);
  }

  @Test
  public void testCounter() {
    testExample("Examples/PropertyAccessors/Counter.kt", propertyaccessors.CounterKt::main);
  }

  @Test
  public void testData() {
    testExample("Examples/PropertyAccessors/Data.kt", propertyaccessors.DataKt::main);
  }

  @Test
  public void testDefault() {
    testExample("Examples/PropertyAccessors/Default.kt", DefaultKt::main);
  }

  @Test
  public void testHamsters() {
    testExample("Examples/PropertyAccessors/Hamsters.kt", propertyaccessors.HamstersKt::main);
  }

  @Test
  public void testLogChanges() {
    testExample("Examples/PropertyAccessors/LogChanges.kt", LogChangesKt::main);
  }

  @Test
  public void testFibonacciProperty() {
    testExample("Examples/PropertyDelegation/FibonacciProperty.kt", FibonacciPropertyKt::main);
  }

  @Test
  public void testNickName() {
    testExample("Examples/PropertyDelegation/NickName.kt", propertydelegation.NickNameKt::main);
  }

  @Test
  public void testTeam() {
    testExample("Examples/PropertyDelegation/Team.kt", TeamKt::main);
  }

  @Test
  public void testTeamWithTraditions() {
    testExample("Examples/PropertyDelegation/TeamWithTraditions.kt", TeamWithTraditionsKt::main);
  }

  @Test
  public void testAddCodePoints() {
    testExample("Examples/Recursion/AddCodePoints.kt", AddCodePointsKt::main);
  }

  @Test
  public void testFacto() {
    testExample("Examples/Recursion/Facto.kt", FactoKt::main);
  }

  @Test
  public void testFactorial() {
    testExample("Examples/Recursion/Factorial.kt", recursion.FactorialKt::main);
  }

  @Test
  public void testFactorials() {
    testExample("Examples/Recursion/Factorials.kt", FactorialsKt::main);
  }

  @Test
  public void testFibo() {
    testExample("Examples/Recursion/Fibo.kt", FiboKt::main);
  }

  @Test
  public void testFibonacci() {
    testExample("Examples/Recursion/Fibonacci.kt", recursion.FibonacciKt::main);
  }

  @Test
  public void testPhi() {
    testExample("Examples/Recursion/Phi.kt", PhiKt::main);
  }

  @Test
  public void testSumOfSquares() {
    testExample("Examples/Recursion/SumOfSquares.kt", SumOfSquaresKt::main);
  }

  @Test
  public void testInfo() {
    testExample("Examples/Reflection/Info.kt", InfoKt::main);
  }

  @Test
  public void testSolid() {
    testExample("Examples/Reflection/Solid.kt", SolidKt::main);
  }

  @Test
  public void testAssignmentOperators() {
    testExample("Examples/RepetitionWithWhile/AssignmentOperators.kt", AssignmentOperatorsKt::main);
  }

  @Test
  public void testDoWhileLoop() {
    testExample("Examples/RepetitionWithWhile/DoWhileLoop.kt", DoWhileLoopKt::main);
  }

  @Test
  public void testIncrementOperator() {
    testExample("Examples/RepetitionWithWhile/IncrementOperator.kt", IncrementOperatorKt::main);
  }

  @Test
  public void testWhileLoop() {
    testExample("Examples/RepetitionWithWhile/WhileLoop.kt", WhileLoopKt::main);
  }

  @Test
  public void testChainedCalls() {
    testExample("Examples/SafeCalls/ChainedCalls.kt", ChainedCallsKt::main);
  }

  @Test
  public void testDereferenceNull() {
    testExample("Examples/SafeCalls/DereferenceNull.kt", DereferenceNullKt::main);
  }

  @Test
  public void testSafeCall() {
    testExample("Examples/SafeCalls/SafeCall.kt", SafeCallKt::main);
  }

  @Test
  public void testSafeOperation() {
    testExample("Examples/SafeCalls/SafeOperation.kt", SafeOperationKt::main);
  }

  @Test
  public void testRegularClasses() {
    testExample("Examples/SealedClasses/RegularClasses.kt", RegularClassesKt::main);
  }

  @Test
  public void testSealedClasses() {
    testExample("Examples/SealedClasses/SealedClasses.kt", sealedclasses.SealedClassesKt::main);
  }

  @Test
  public void testGardenGnome() {
    testExample("Examples/SecondaryConstructors/GardenGnome.kt", GardenGnomeKt::main);
  }

  @Test
  public void testIterable() {
    testExample("Examples/Sets/Iterable.kt", IterableKt::main);
  }

  @Test
  public void testMutableSet() {
    testExample("Examples/Sets/MutableSet.kt", MutableSetKt::main);
  }

  @Test
  public void testRemoveDuplicates() {
    testExample("Examples/Sets/RemoveDuplicates.kt", RemoveDuplicatesKt::main);
  }

  @Test
  public void testSets() {
    testExample("Examples/Sets/Sets.kt", SetsKt::main);
  }

  @Test
  public void testSmartCasts() {
    testExample("Examples/SmartCasts/SmartCasts.kt", smartcasts.SmartCastsKt::main);
  }

  @Test
  public void testWhenAndSmartCasts() {
    testExample("Examples/SmartCasts/WhenAndSmartCasts.kt", smartcasts.WhenAndSmartCastsKt::main);
  }

  @Test
  public void testExpressionInTemplate() {
    testExample("Examples/StringTemplates/ExpressionInTemplate.kt", ExpressionInTemplateKt::main);
  }

  @Test
  public void testStringConcatenation() {
    testExample("Examples/StringTemplates/StringConcatenation.kt", StringConcatenationKt::main);
  }

  @Test
  public void testStringTemplates() {
    testExample("Examples/StringTemplates/StringTemplates.kt", StringTemplatesKt::main);
  }

  @Test
  public void testTripleQuotes() {
    testExample("Examples/StringTemplates/TripleQuotes.kt", TripleQuotesKt::main);
  }

  @Test
  public void testBasicFunctions() {
    testExample("Examples/Summary1/BasicFunctions.kt", BasicFunctionsKt::main);
  }

  @Test
  public void testBooleans() {
    testExample("Examples/Summary1/Booleans.kt", BooleansKt::main);
  }

  @Test
  public void testIfExpression() {
    testExample("Examples/Summary1/IfExpression.kt", IfExpressionKt::main);
  }

  @Test
  public void testIfResult() {
    testExample("Examples/Summary1/IfResult.kt", IfResultKt::main);
  }

  @Test
  public void testIntRange() {
    testExample("Examples/Summary1/IntRange.kt", IntRangeKt::main);
  }

  @Test
  public void testIterateThroughString() {
    testExample("Examples/Summary1/IterateThroughString.kt", IterateThroughStringKt::main);
  }

  @Test
  public void testNumberTypes() {
    testExample("Examples/Summary1/NumberTypes.kt", NumberTypesKt::main);
  }

  @Test
  public void testOverflow() {
    testExample("Examples/Summary1/Overflow.kt", OverflowKt::main);
  }

  @Test
  public void testRangeMembership() {
    testExample("Examples/Summary1/RangeMembership.kt", RangeMembershipKt::main);
  }

  @Test
  public void testStrTemplates() {
    testExample("Examples/Summary1/StrTemplates.kt", StrTemplatesKt::main);
  }

  @Test
  public void testThreeQuotes() {
    testExample("Examples/Summary1/ThreeQuotes.kt", ThreeQuotesKt::main);
  }

  @Test
  public void testTruncation() {
    testExample("Examples/Summary1/Truncation.kt", TruncationKt::main);
  }

  @Test
  public void testUnitReturn() {
    testExample("Examples/Summary1/UnitReturn.kt", UnitReturnKt::main);
  }

  @Test
  public void testClassBodies() {
    testExample("Examples/Summary2/ClassBodies.kt", ClassBodiesKt::main);
  }

  @Test
  public void testListCollection() {
    testExample("Examples/Summary2/ListCollection.kt", ListCollectionKt::main);
  }

  @Test
  public void testTemperature() {
    testExample("Examples/Summary2/Temperature.kt", TemperatureKt::main);
  }

  @Test
  public void testTicTacToe() {
    testExample("Examples/Summary2/TicTacToe.kt", TicTacToeKt::main);
  }

  @Test
  public void testUseALibrary() {
    testExample("Examples/Summary2/UseALibrary.kt", UseALibraryKt::main);
  }

  @Test
  public void testUsingAtomicTest() {
    testExample("Examples/Summary2/UsingAtomicTest.kt", UsingAtomicTestKt::main);
  }

  @Test
  public void testTDDFail() {
    testExample("Examples/Testing/TDDFail.kt", testing1.TDDFailKt::main);
  }

  @Test
  public void testTDDStillFails() {
    testExample("Examples/Testing/TDDStillFails.kt", testing2.TDDStillFailsKt::main);
  }

  @Test
  public void testTDDWorks() {
    testExample("Examples/Testing/TDDWorks.kt", testing3.TDDWorksKt::main);
  }

  @Test
  public void testTestingExample() {
    testExample("Examples/Testing/TestingExample.kt", TestingExampleKt::main);
  }

  @Test
  public void testAssertTrue() {
    testExample("Examples/UnitTesting/AssertTrue.kt", AssertTrueKt::main);
  }

  @Test
  public void testCompareTo() {
    testExample("Examples/UsingOperators/CompareTo.kt", usingoperators.CompareToKt::main);
  }

  @Test
  public void testDestructuringData() {
    testExample("Examples/UsingOperators/DestructuringData.kt", usingoperators.DestructuringDataKt::main);
  }

  @Test
  public void testDestructuringDuo() {
    testExample("Examples/UsingOperators/DestructuringDuo.kt", DestructuringDuoKt::main);
  }

  @Test
  public void testDestructuringMap() {
    testExample("Examples/UsingOperators/DestructuringMap.kt", usingoperators.DestructuringMapKt::main);
  }

  @Test
  public void testImmutableAndPlus() {
    testExample("Examples/UsingOperators/ImmutableAndPlus.kt", ImmutableAndPlusKt::main);
  }

  @Test
  public void testNewAngle() {
    testExample("Examples/UsingOperators/NewAngle.kt", NewAngleKt::main);
  }

  @Test
  public void testOperatorPlus() {
    testExample("Examples/UsingOperators/OperatorPlus.kt", OperatorPlusKt::main);
  }

  @Test
  public void testUnexpected() {
    testExample("Examples/UsingOperators/Unexpected.kt", UnexpectedKt::main);
  }

  @Test
  public void testListOf() {
    testExample("Examples/Varargs/ListOf.kt", ListOfKt::main);
  }

  @Test
  public void testSpreadOperator() {
    testExample("Examples/Varargs/SpreadOperator.kt", SpreadOperatorKt::main);
  }

  @Test
  public void testTwoFunctionsWithVarargs() {
    testExample("Examples/Varargs/TwoFunctionsWithVarargs.kt", TwoFunctionsWithVarargsKt::main);
  }

  @Test
  public void testVarargLikeList() {
    testExample("Examples/Varargs/VarargLikeList.kt", VarargLikeListKt::main);
  }

  @Test
  public void testVarargSum() {
    testExample("Examples/Varargs/VarargSum.kt", VarargSumKt::main);
  }

  @Test
  public void testVariableArgLists() {
    testExample("Examples/Varargs/VariableArgLists.kt", VariableArgListsKt::main);
  }

  @Test
  public void testAVariableIsMutable() {
    testExample("Examples/Variables/AVariableIsMutable.kt", AVariableIsMutableKt::main);
  }

  @Test
  public void testVals() {
    testExample("Examples/Variables/Vals.kt", ValsKt::main);
  }

  @Test
  public void testVars() {
    testExample("Examples/Variables/Vars.kt", VarsKt::main);
  }

  @Test
  public void testCookie() {
    testExample("Examples/Visibility/Cookie.kt", CookieKt::main);
  }

  @Test
  public void testObserveAnimals() {
    testExample("Examples/Visibility/ObserveAnimals.kt", ObserveAnimalsKt::main);
  }

  @Test
  public void testWhenAsStatement() {
    testExample("Examples/WhenExpressions/WhenAsStatement.kt", WhenAsStatementKt::main);
  }

  @Test
  public void testWhenExpressions() {
    testExample("Examples/WhenExpressions/WhenExpressions.kt", WhenExpressionsKt::main);
  }

  @Test
  public void testIndexWithZip() {
    testExample("Examples/Zipping/IndexWithZip.kt", IndexWithZipKt::main);
  }

  @Test
  public void testZipMap() {
    testExample("Examples/Zipping/ZipMap.kt", zipping.ZipMapKt::main);
  }

  @Test
  public void testZipper() {
    testExample("Examples/Zipping/Zipper.kt", ZipperKt::main);
  }
}
